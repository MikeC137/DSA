import java.util.Iterator;
import java.util.EmptyStackException;

public class ArrayStack<E> implements Stack<E> {
    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayStack() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    @Override
    public E push(E item) {
        if (size == elements.length) {
            grow();
        }
        elements[size] = item;
        size++;
        return item;
    }

    @Override
    public E peek() {
        if (empty()) {
            throw new EmptyStackException();
        }
        return elements[size - 1];
    }

    @Override
    public E pop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pop'");
    }

    @Override
    public int search(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'search'");
    }

    @Override
    public boolean empty() {
        return size == 0;
    }

    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    private void grow() {
        E[] doubleStack = (E[]) new Object[2 * size];
        for (int i = 0; i < elements.length; i++) {
            doubleStack[i] = elements[i];
        }
        elements = doubleStack;
    }
}
