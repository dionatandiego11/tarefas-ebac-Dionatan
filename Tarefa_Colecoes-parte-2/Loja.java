import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Loja {
    public static void limparTela() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public static void main(String[] args) throws Exception {
        HashMap<Integer, String> nomes = new HashMap<Integer, String>();
        HashMap<Integer, Double> precos = new HashMap<Integer, Double>(); // Corrected type to String
        Scanner scan = new Scanner(System.in);
        int opcaoMenu = 0;
        do {   
            limparTela();
            mostrarMenu();
            opcaoMenu = lerOpcaoMenu(scan);
            if (!processarOpcaoMenu(scan, opcaoMenu, nomes, precos)) {
                System.out.println("Opção inválida. Tente novamente");
                Thread.sleep(2000);
            }
        } while (opcaoMenu != 5);
    
        scan.close();
    }
    
    private static boolean processarOpcaoMenu(Scanner scan, int opcaoMenu, 
        HashMap<Integer, String> nomes, HashMap<Integer, Double> precos) throws IOException, 
           InterruptedException {
        switch (opcaoMenu) {
			case 1:
			    inserirProduto(scan, nomes, precos);
                return true;
            case 2:
                alterarProduto(scan, nomes, precos);
                return true;
            case 3:
                removerProduto(scan, nomes, precos);
                return true;
            case 4:
                listarProdutos(nomes, precos);
                return true;
            case 5:
                sairDoPrograma();
                return true;
            default:
                return false;
        }
    }

        private static void sairDoPrograma() throws InterruptedException, IOException{
            System.out.println("Saindo do programa...");
            Thread.sleep(1000);
            limparTela(); 
        } 
        private static void listarProdutos(HashMap<Integer, String> nomes, 
		    HashMap<Integer, Double> precos) throws IOException, InterruptedException {
            limparTela();
            System.out.println("Produtos Cadastrados");
            System.out.println("-".repeat(30)); // Linha de separação
            System.out.format("%-8s | %-20s | %-10s%n", "Código", "Nome", "Preço");
            System.out.println("-".repeat(30)); // Linha de separação
            for (int chave : nomes.keySet()) {
                System.out.format("%08d | %-20s | %10.2f%n", chave, nomes.get(chave), precos.get(chave));
            }
            System.out.println("-".repeat(30)); // Linha de separação
            System.out.print(">> Pressione ENTER para voltar ao menu...");
            System.in.read();
        }
        
        private static void removerProduto(Scanner scan, HashMap<Integer, String> nomes,
         HashMap<Integer, Double> precos) throws IOException, InterruptedException {
            limparTela();
            System.out.println("REMOÇÃO DE PRODUTO");
            System.out.println("- ");
            System.out.print(">> Código: ");
            int codigo = scan.nextInt();
            scan.nextLine();
            if (nomes.containsKey(codigo)) {
                System.out.format("Valores originais: %n%s, R$ %.2f%n",
                nomes.get(codigo), precos.get(codigo));
                System.out.print(">> Confirma a exclusão (S/N)? ");
                String resposta = scan.nextLine().trim();
            if (resposta.toUpperCase().equals("S")) {
                nomes.remove(codigo);
                precos.remove(codigo);
                System.out.println("- "); 
                System.out.println("Produto removido com sucesso!");
                System.out.println(">> Pressione ENTER para voltar ao menu...");
            } else {
                System.out.println("Remoção não confirmada!");
            }
        } else {
            System.out.println("Produto não encontrado!");
        }
        System.in.read();
        System.out.println(">> Pressione ENTER para voltar ao menu...");
        }

        private static void inserirProduto(Scanner scan, HashMap<Integer, String> nomes, 
        HashMap<Integer, Double> precos) throws IOException, InterruptedException {
            limparTela();
            System.out.println("INSERÇÃO DE PRODUTO");
            System.out.println("-- -");
            System.out.print(">> Nome: ");
            String nome = scan.nextLine();
            System.out.print(">> Preço: ");
            Double preco = scan.nextDouble();
            scan.nextLine();  // Adicione esta linha
            int proximaChave = obterProximaChave(nomes.keySet());
            nomes.put(proximaChave, nome);
            precos.put(proximaChave, preco);
            System.out.println("-- ----");
            System.out.println("Produto inserido com sucesso!");
            System.out.print(">> Pressione ENTER para voltar ao menu...");
            System.in.read();
        }

    private static int obterProximaChave(Set<Integer> keySet) {
        if (keySet.size() > 0) {
            return Collections.max(keySet) + 1; 
        } else return 1;
    }
	
    private static void alterarProduto(Scanner scan, HashMap<Integer, String> nomes, 
    HashMap<Integer, Double> precos) throws IOException, InterruptedException {
        limparTela();
        System.out.println("ALTERAÇÃO DE PRODUTO");
        System.out.println("---------------------");
        System.out.print(">> Código: ");
        int codigo = scan.nextInt();
        scan.nextLine();
        if (nomes.containsKey(codigo)) {
            System.out.format("Valores originais: %n%s, R$ %.2f%n",
            nomes.get(codigo), precos.get(codigo));
            System.out.println("(Deixe em branco para manter o valor original)"); 
            System.out.print(">> Novo nome: ");
            String novoNome = scan.nextLine().trim();
            novoNome = novoNome.isEmpty()? nomes.get(codigo): novoNome;
            System.out.print(">> Novo preço: ");
            String novoPrecoStr = scan.nextLine().trim();
            Double novoPreco = novoPrecoStr.isEmpty() ? precos.get(codigo): 
               Double.parseDouble(novoPrecoStr.replace(',','.'));
            nomes.put(codigo, novoNome);
            precos.put(codigo, novoPreco);
            System.out.println(" ----------------------------");
            System.out.println("Produto alterado com sucesso!");
         } else {
            System.out.println("Produto não encontrado!");
        }
        System.in.read();
        System.out.println(">> Pressione ENTER para voltar ao menu...");
    }    
	private static int lerOpcaoMenu(Scanner scan) {
		System.out.print(">> Opção desejada: ");
		int opcaoEscolhida = scan.nextInt();
		scan.nextLine();
		return opcaoEscolhida;
	}

    private static void mostrarMenu() {
        System.out.println("---- CADASTRO DE PRODUTOS ----");
        System.out.println("------------------------");
        System.out.println("1. Adicionar produto");
        System.out.println("2. Alterar produto");
        System.out.println("3. Remover produto");
        System.out.println("4. Listar produto");
        System.out.println("5. Sair");
		System.out.println("------------------------");
    }
}
