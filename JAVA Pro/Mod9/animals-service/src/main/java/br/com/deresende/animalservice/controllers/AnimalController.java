package br.com.deresende.animalservice.controller;

import br.com.deresende.animalservice.entidades.Animal;
import br.com.deresende.animalservice.dto.ResgatePorFuncionarioDTO;
import br.com.deresende.animalservice.repositorios.AnimalRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import jakarta.validation.Valid;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    private final AnimalRepository repository;

    public AnimalController(AnimalRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Animal> findAll() {
        return repository.findAll();
    }

    @PostMapping
    public Animal create(@RequestBody @Valid Animal animal) {
        return repository.save(animal);
    }

    @GetMapping("/not-adopted")
    public List<Animal> findNotAdopted() {
        return repository.findNotAdopted();
    }

    @GetMapping("/adopted")
    public List<Animal> findAdopted() {
        return repository.findAdopted();
    }

    @GetMapping("/especie/{especie}")
    public List<Animal> findByEspecie(@PathVariable String especie) {
        return repository.findByEspecie(especie);
    }

    @GetMapping("/estatisticas/resgates")
    public List<ResgatePorFuncionarioDTO> getEstatisticasResgates(
            @RequestParam(required = false) Date dataInicio,
            @RequestParam(required = false) Date dataFim) {

        // Se não for fornecida a data de início, usa 1 ano atrás como padrão
        if (dataInicio == null) {
            LocalDate umAnoAtras = LocalDate.now().minusYears(1);
            dataInicio = Date.valueOf(umAnoAtras);
        }

        // Se não for fornecida a data de fim, usa a data atual como padrão
        if (dataFim == null) {
            dataFim = Date.valueOf(LocalDate.now());
        }

        return repository.countAnimalsByResgateNoIntervalo(dataInicio, dataFim);
    }
}
