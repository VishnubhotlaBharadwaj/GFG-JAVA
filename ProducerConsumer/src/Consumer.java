public class Consumer extends Thread{
    BufferSpace bufferSpace;

    Consumer( BufferSpace bufferSpace) {
        this.bufferSpace = bufferSpace;
    }

    public void run() {
        while(true) {
            try {
                int item = bufferSpace.consume_int();
                Thread.sleep(1000);
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
