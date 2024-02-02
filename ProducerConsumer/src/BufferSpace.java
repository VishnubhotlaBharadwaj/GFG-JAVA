public class BufferSpace {
    int buffer;

    public void produce_item(int item) {
        buffer = item;
    }

    public int consume_int(){
        return buffer;
    }
}
