import java.util.Iterator;

public interface Stack<E> extends Iterable {
    public E push(E item);

    public E peek();

    public E pop();

    public int search(E e);

    public boolean emoty();

    public Iterator<E> iterator();
}
