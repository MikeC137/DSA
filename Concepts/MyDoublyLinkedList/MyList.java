import java.util.Iterator;

public interface MyList<E> extends Iterable<E> {

    public void addFirst(E e);

    public void addLast(E e);

    public void add(int index, E e);

    public E removeFirst();

    public E removeLast();

    public E remove(int index);

    public boolean remove(Object o);

    public E getFirst();

    public E getLast();

    public E get(int index);

    public E set(int index, E e);

    public boolean contains(Object o);

    public int indexOf(Object o);

    public int lastIndexOf(Object o);

    public void clear();

    public Iterator<E> iterator();
}
