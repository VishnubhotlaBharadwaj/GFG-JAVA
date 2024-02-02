public class Producer extends Thread{
    BufferSpace bufferSpace;

    Producer( BufferSpace bufferSpace) {
        this.bufferSpace = bufferSpace;
    }

    public void run() {
        int i =1;
        while(true) {
            bufferSpace.produce_item(i);
            i++;
            try {
                Thread.sleep(1000);
            }
           catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
