public class FIFO {
    // Array que armazenará os elementos da fila
    private int[] elementos;
    // Índice do primeiro elemento da fila (frente)
    private int front;
    // Índice do último elemento da fila (traseira)
    private int rear;
    // Quantidade atual de elementos na fila
    private int size;
    // Capacidade máxima da fila
    private int capacity;

    // Construtor que define a capacidade da fila
    public FIFO(int capacity) {
        this.capacity = capacity;
        this.elementos = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // enqueue(): Adiciona um elemento ao final da fila
    public void enqueue(int elemento) {
        if (size == capacity) {
            throw new RuntimeException("Fila cheia");
        }
        // Calcula a nova posição do rear (circularmente)
        rear = (rear + 1) % capacity;
        elementos[rear] = elemento;
        size++;
    }

    // dequeue(): Remove e retorna o elemento da frente da fila
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia");
        }
        int elemento = elementos[front];
        // Atualiza a posição da frente (circularmente)
        front = (front + 1) % capacity;
        size--;
        return elemento;
    }

    // front(): Retorna o elemento da frente sem removê-lo
    public int front() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia");
        }
        return elementos[front];
    }

    // rear(): Retorna o elemento do final da fila sem removê-lo
    public int rear() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia");
        }
        return elementos[rear];
    }

    // size(): Retorna o número de elementos na fila
    public int size() {
        return size;
    }

    // isEmpty(): Verifica se a fila está vazia
    public boolean isEmpty() {
        return size == 0;
    }
}
