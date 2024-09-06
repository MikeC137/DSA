import java.util.Iterator;

public interface Stack<E> extends Iterable {
    public E push(E item);

    public E peek();

    public E pop();

    public int search(Object o);

    public boolean empty();

    public Iterator<E> iterator();
}
