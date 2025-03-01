public class Pilha<T> {
    // Array para armazenar os elementos da pilha
    private T[] elementos;
    // Índice que representa o topo da pilha (-1 indica que a pilha está vazia)
    private int topo;

    // Construtor que recebe a capacidade máxima da pilha
    @SuppressWarnings("unchecked")
    public Pilha(int capacidade) {
        elementos = (T[]) new Object[capacidade];
        topo = -1;
    }

    // push(): Adiciona um elemento no topo da pilha
    public void push(T elemento) {
        if (topo == elementos.length - 1) {
            throw new RuntimeException("Pilha cheia");
        }
        elementos[++topo] = elemento;
    }

    // pop(): Remove e retorna o elemento do topo da pilha
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        T elemento = elementos[topo];
        elementos[topo] = null; // Limpa a referência para o garbage collector
        topo--;
        return elemento;
    }

    // top(): Retorna o elemento do topo sem removê-lo
    public T top() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        return elementos[topo];
    }

    // isEmpty(): Verifica se a pilha está vazia
    public boolean isEmpty() {
        return topo == -1;
    }

    // size(): Retorna o número de elementos na pilha
    public int size() {
        return topo + 1;
    }
}
