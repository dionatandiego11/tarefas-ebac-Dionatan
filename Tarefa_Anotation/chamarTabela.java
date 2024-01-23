@Tabela(nome = "MinhaTabela")
public class chamarTabela {
    public static void main(String[] args) {
        Class<?> chamarTabela = chamarTabela.class;

        // Verifica se a anotação está presente
        if (chamarTabela.isAnnotationPresent(Tabela.class)) {
            // Obtém a instância da anotação
            Tabela tabelaAnnotation = chamarTabela.getAnnotation(Tabela.class);

            // Obtém o valor do parâmetro 'nome'
            String nomeDaTabela = tabelaAnnotation.nome();

            // Imprime o nome da tabela
            System.out.println("Nome da Tabela: " + nomeDaTabela);
        }
    }
}