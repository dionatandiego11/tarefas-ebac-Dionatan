public class Main {
    public static void main(String[] args) {
        // Cria uma fila com capacidade para 5 elementos
        FIFO fifo = new FIFO(5);

        // Adiciona elementos à fila
        fifo.enqueue(10);
        fifo.enqueue(20);
        fifo.enqueue(30);

        // Exibe o elemento na frente da fila
        System.out.println("Frente: " + fifo.front()); // Saída: 10

        // Exibe o elemento no final da fila
        System.out.println("Traseira: " + fifo.rear()); // Saída: 30

        // Remove o elemento da frente e o exibe
        System.out.println("Removido: " + fifo.dequeue()); // Saída: 10

        // Exibe o novo elemento da frente após a remoção
        System.out.println("Nova frente: " + fifo.front()); // Saída: 20

        // Exibe o tamanho atual da fila
        System.out.println("Tamanho da fila: " + fifo.size()); // Saída: 2

        // Verifica se a fila está vazia
        System.out.println("Fila está vazia? " + fifo.isEmpty()); // Saída: false
    }
}
