import java.util.Iterator;
import java.util.NoSuchElementException;

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

    @Override
    public void add(int index, E element) {
        if (!(isIndexValid(index, true))) {
            throw new IndexOutOfBoundsException("Index is out of bounds: " + index);
        }
        if (isFull()) {
            grow();
        }
        shiftRight(index);
        data[index] = element;
        size++;
    }

    @Override
    public E remove(int index) {
        if (!(isIndexValid(index, false))) {
            throw new IndexOutOfBoundsException("Index is out of bounds: " + index);
        }
        E removedElement = data[index];
        shiftLeft(index);
        data[--size] = null;
        return removedElement;
    }

    @Override
    public boolean remove(E element) {
        int index = indexOf(element);
        if (index == -1) {
            return false;
        }
        remove(index);
        return true;
    }

    @Override
    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public E get(int index) {
        if (!(isIndexValid(index, false))) {
            throw new IndexOutOfBoundsException("Index is out of bounds: " + index);
        }
        return data[index];
    }

    @Override
    public E set(int index, E element) {
        if (!(isIndexValid(index, false))) {
            throw new IndexOutOfBoundsException("Index is out of bounds: " + index);
        }
        E replacedElement = data[index];
        data[index] = element;
        return replacedElement;
    }

    @Override
    public int lastIndexOf(E element) {
        for (int i = size - 1; i > 0; i--) {
            if (data[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void grow() {
        E[] newData = (E[]) new Object[(data.length * 2)];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    private boolean isIndexValid(int index, boolean forAdd) {
        if (forAdd) {
            return index >= 0 && index <= size;
        } else {
            return index >= 0 && index < size;
        }
    }

    private void shiftRight(int index) {
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1]; // Size = 10, index = 6, data[10] = data[9]
        }
    }

    private void shiftLeft(int index) {
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1]; // Size = 10, index = 5, data[5] = data[6]
        }
    }

    @Override
    public boolean contains(E element) {
        return indexOf(element) != -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        for (int i = 0; i < data.length; i++) {
            data[i] = null;
        }
        size = 0;
    }

    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new MyArrayListIterator();
    }

    private class MyArrayListIterator implements Iterator<E> {
        private int position;

        public MyArrayListIterator() {
            position = 0;
        }

        @Override
        public boolean hasNext() {
            return position < size;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return data[position++];
        }

    }
}
