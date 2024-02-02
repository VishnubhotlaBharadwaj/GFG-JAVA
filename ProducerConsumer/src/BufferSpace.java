import java.lang.Thread;

public class BufferSpace {
    int buffer;
    boolean flag = false;

    synchronized public void produce_item(int item) throws Exception{
        if (flag == true) {
            wait();
        }
        buffer = item;
        System.out.println("Produced item : " + buffer);
        flag = true;
        notify();
    }

    synchronized public int consume_int() throws Exception{
        if (flag == false) {
            wait();
        }
        System.out.println("Consumed item : " + buffer);
        flag = false;
        notify();
        return buffer;
    }
}
