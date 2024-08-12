import java.util.Iterator;

public interface MyList<E> extends Iterable<E> {

    public void add(E element);

    public void add(int index, E element);

    public E remove(int index);

    public boolean remove(E element);

    public E set(int index, E element);

    public E get(int index);

    public boolean contains(E element);

    public boolean equals(Object object);

    public int indexOf(E element);

    public int lastIndexOf(E element);

    public int size();

    public boolean isEmpty();

    public void clear();

    public String toString();

    public Iterator<E> iterator();
}
