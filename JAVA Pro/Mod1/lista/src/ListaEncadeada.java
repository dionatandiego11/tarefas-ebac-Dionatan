public class ListaEncadeada {
    // Nó que representa o início da lista
    private Node head;
    // Tamanho atual da lista
    private int size;

    // Construtor: inicializa a lista vazia
    public ListaEncadeada() {
        head = null;
        size = 0;
    }

    // Classe que representa um nó da lista
    public static class Node {
        // Valor inteiro armazenado no nó
        public int data;
        // Referência para o próximo nó na lista
        public Node next;

        // Construtor do nó
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return String.valueOf(data);
        }
    }

    /**
     * Adiciona um nó no início da lista.
     * @param node Nó a ser adicionado.
     */
    public void push(Node node) {
        node.next = head;
        head = node;
        size++;
    }

    /**
     * Remove e retorna o nó do início da lista.
     * @return Nó removido.
     */
    public Node pop() {
        if (head == null) {
            throw new RuntimeException("Lista vazia");
        }
        Node removed = head;
        head = head.next;
        removed.next = null; // Limpa a referência
        size--;
        return removed;
    }

    /**
     * Insere um nó na posição especificada.
     * @param index Posição onde o nó será inserido (0-based).
     * @param node Nó a ser inserido.
     */
    public void insert(int index, Node node) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Índice fora dos limites");
        }
        if (index == 0) {
            push(node);
        } else {
            Node current = head;
            // Percorre até o nó anterior à posição desejada
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
            size++;
        }
    }

    /**
     * Remove o nó que está na posição especificada.
     * @param index Posição do nó a ser removido (0-based).
     */
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice fora dos limites");
        }
        if (index == 0) {
            pop();
        } else {
            Node current = head;
            // Percorre até o nó anterior ao que será removido
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node removed = current.next;
            current.next = removed.next;
            removed.next = null; // Limpa a referência
            size--;
        }
    }

    /**
     * Retorna o nó que está na posição especificada.
     * @param index Posição do nó (0-based).
     * @return Nó localizado na posição informada.
     */
    public Node elementAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice fora dos limites");
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    /**
     * Retorna o tamanho (número de nós) da lista.
     * @return Tamanho da lista.
     */
    public int size() {
        return size;
    }

    /**
     * Retorna uma representação textual da lista.
     * Exemplo: "10 -> 20 -> 30"
     * @return String com a representação da lista.
     */
    public String printList() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        return sb.toString();
    }
}

