public interface MyList<E> extends Iterable<E> {
    public boolean add(E e);

    public void add(int index, E element);

    public void addFirst(E e);

    public void addLast(E e);

    public E removeFirst();

    public E removeLast();

    public E remove(int index);

    public E getFirst();

    public E getLast();

    public E get(int index);

    public E set(int index, E e);
}