public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        // Adiciona nós no início da lista (push)
        lista.push(new ListaEncadeada.Node(30));
        lista.push(new ListaEncadeada.Node(20));
        lista.push(new ListaEncadeada.Node(10));
        // Lista: 10 -> 20 -> 30
        System.out.println("Lista após push: " + lista.printList());

        // Remove o nó do início da lista (pop)
        ListaEncadeada.Node removido = lista.pop();
        System.out.println("Nó removido (pop): " + removido);
        // Lista: 20 -> 30
        System.out.println("Lista após pop: " + lista.printList());

        // Insere um nó na posição 1
        lista.insert(1, new ListaEncadeada.Node(25));
        // Lista: 20 -> 25 -> 30
        System.out.println("Lista após insert na posição 1: " + lista.printList());

        // Remove o nó da posição 2 (nó com valor 30)
        lista.remove(2);
        // Lista: 20 -> 25
        System.out.println("Lista após remover o nó na posição 2: " + lista.printList());

        // Obtém o nó na posição 1
        ListaEncadeada.Node node = lista.elementAt(1);
        System.out.println("Nó na posição 1: " + node);

        // Exibe o tamanho da lista
        System.out.println("Tamanho da lista: " + lista.size());

        // Void

        
    }
}

