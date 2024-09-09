import java.util.Iterator;

public interface Queue<E> {
    public E element();

    public boolean enqueue(E e);

    public E peek();

    public E dequeue();

    public Iterator iterator();
}
