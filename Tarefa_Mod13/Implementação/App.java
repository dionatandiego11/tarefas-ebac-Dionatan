public class App {

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();

        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Marcos Paulo");
        pf.setCpf("12345678901");

        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Lojas Mariana");  
        pj.setCnpj("12345678000200");

        pessoa.add(pf);
        pessoa.add(pj);

        // Imprimir informações da PessoaFisica
        System.out.println("Informações da Pessoa Física:");
        System.out.println("Nome: " + pf.getNome());
        System.out.println("CPF: " + pf.getCpf());
        System.out.println();

        // Imprimir informações da PessoaJuridica
        System.out.println("Informações da Pessoa Jurídica:");
        System.out.println("Nome: " + pj.getNome());
        System.out.println("CNPJ: " + pj.getCnpj());
    }
}

