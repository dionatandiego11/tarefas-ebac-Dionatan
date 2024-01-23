@Tabela(nome = "MinhaTabela")
public class MinhaClasse {
    public static void main(String[] args) {
        Class<?> minhaClasse = MinhaClasse.class;

        // Verifica se a anotação está presente
        if (minhaClasse.isAnnotationPresent(Tabela.class)) {
            // Obtém a instância da anotação
            Tabela tabelaAnnotation = minhaClasse.getAnnotation(Tabela.class);

            // Obtém o valor do parâmetro 'nome'
            String nomeDaTabela = tabelaAnnotation.nome();

            // Imprime o nome da tabela
            System.out.println("Nome da Tabela: " + nomeDaTabela);
        }
    }
}