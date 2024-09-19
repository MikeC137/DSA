import java.util.Iterator;

public interface Queue<E> {
    public boolean enqueue(E e);

    public E peek();

    public E dequeue();

    public Iterator iterator();
}
