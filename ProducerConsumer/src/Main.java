public class Main {
    public static void main(String[] args) {
        BufferSpace bufferSpace = new BufferSpace();
        Producer producer = new Producer(bufferSpace);
        Consumer consumer = new Consumer(bufferSpace);

        producer.start();
        consumer.start();
    }
}