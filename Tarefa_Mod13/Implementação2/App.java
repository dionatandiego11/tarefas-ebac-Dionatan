public class App {
    public static void main(String args[]) {
        PessoaFisica pessoaFisica = new PessoaFisica("John Doe", "1");
        System.out.println(pessoaFisica);

        PessoaJuridica pessoaJuridica = new PessoaJuridica("Marcos", "2");
        System.out.println(pessoaJuridica);
    }
}

