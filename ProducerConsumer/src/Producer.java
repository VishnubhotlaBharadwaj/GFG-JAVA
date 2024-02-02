public class Producer extends Thread{
    BufferSpace bufferSpace;

    Producer( BufferSpace bufferSpace) {
        this.bufferSpace = bufferSpace;
    }

    public void run() {
        int i =1;
        while(true) {
            try {
                bufferSpace.produce_item(i);
                i++;
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
