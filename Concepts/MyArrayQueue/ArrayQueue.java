public class ArrayQueue<E> {
    private static final int INITIAL_CAPACITY = 10;
    private E[] queue;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue() {
        E[] queueArray = (E[]) new Object[INITIAL_CAPACITY];
        front = 0;
        rear = 0;
        size = 0;
    }

}
