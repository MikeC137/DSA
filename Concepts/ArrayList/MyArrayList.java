import java.util.Iterator;

public class MyArrayList<E> implements MyList<E> {
    private static final int INITIAL_CAPACITY = 10;
    private int size;
    private E[] data;

    public MyArrayList() {
        this(INITIAL_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public MyArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Invalid initial capacity: " + initialCapacity);
        }
        data = (E[]) new Object[initialCapacity];
        size = 0;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void add(E element) {
        if (isFull()) {
            grow();
        }
        data[size] = element;
        size++;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void grow() {
        E[] newData = (E[]) new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    @Override
    public void add(int index, E element) {
        if (!(isAddIndexValid(index))) {
            throw new IndexOutOfBoundsException("Index is out of bounds: " + index);
        }
        if (isFull()) {
            grow();
        }
        shiftRight(index);
        data[size] = element;
        size++;
    }

    private void shiftRight(int index) {
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1]; // Size = 10, index = 6, data[10] = data[9]
        }
    }

    private boolean isAddIndexValid(int index) {
        return index >= 0 && index <= size;
    }

    private boolean isIndexValid(int index) {
        return index >= 0 && index < size;
    }

    @Override
    public E remove(int index) {
        if (!(isIndexValid(index))) {
            throw new IndexOutOfBoundsException("Index is out of bounds: " + index);
        }
        E removedElement = data[index];
        data[size--] = null;
        size--;
        return removedElement;
    }

    private void shiftLeft(int index) {
        for (int i = index; index < size - 1; i++) {
            data[i] = data[i + 1]; // Size = 10, index = 5, data[5] = data[6]
        }
    }

    @Override
    public boolean remove(E element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public E set(int index, E element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'set'");
    }

    @Override
    public E get(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public boolean contains(E element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

    @Override
    public int indexOf(E element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'indexOf'");
    }

    @Override
    public int lastIndexOf(E element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lastIndexOf'");
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

}
