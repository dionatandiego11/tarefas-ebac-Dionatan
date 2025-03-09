package br.com.deresende.animalservice.repositorios;

import br.com.deresende.animalservice.entidades.Animal;
import br.com.deresende.animalservice.dto.ResgatePorFuncionarioDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NULL ORDER BY a.dataEntrada DESC")
    List<Animal> findNotAdopted();

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NOT NULL")
    List<Animal> findAdopted();

    @Query("SELECT a FROM Animal a WHERE a.especie = :especie")
    List<Animal> findByEspecie(@Param("especie") String especie);

    @Query("SELECT new br.com.deresende.animalservice.dto.ResgatePorFuncionarioDTO(a.nomeRecebedor, COUNT(a)) " +
           "FROM Animal a " +
           "WHERE a.dataEntrada BETWEEN :dataInicio AND :dataFim " +
           "GROUP BY a.nomeRecebedor " +
           "ORDER BY COUNT(a) DESC")
    List<ResgatePorFuncionarioDTO> countAnimalsByResgateNoIntervalo(
        @Param("dataInicio") Date dataInicio,
        @Param("dataFim") Date dataFim
    );
}
