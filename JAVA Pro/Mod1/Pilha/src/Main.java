//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Cria uma pilha com capacidade para 5 elementos
        Pilha<Integer> pilha = new Pilha<>(5);

        // Adiciona elementos na pilha
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        // Exibe o elemento do topo sem removê-lo
        System.out.println("Elemento no topo: " + pilha.top()); // Saída: 30

        // Remove o elemento do topo e exibe
        System.out.println("Elemento removido: " + pilha.pop()); // Saída: 30

        // Exibe o novo elemento do topo
        System.out.println("Novo elemento no topo: " + pilha.top()); // Saída: 20

        // Verifica se a pilha está vazia e exibe o tamanho
        System.out.println("Pilha está vazia? " + pilha.isEmpty()); // Saída: false
        System.out.println("Número de elementos na pilha: " + pilha.size()); // Saída: 2
    }
}
