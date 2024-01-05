public class ClasseTeste {

    public static void main(String[] args) {
        ICaneta caneta = new CanetaEsferografica();
        caneta.escrever(" Olá");
        System.out.println(caneta.getCor());

        Giz giz = new Giz();
        giz.escrever(" Olá");
        System.out.println(giz.getCor());

        Lapis lapis = new Lapis();
        lapis.escrever(" Olá");
        System.out.println(lapis.getCor());
    }
}
