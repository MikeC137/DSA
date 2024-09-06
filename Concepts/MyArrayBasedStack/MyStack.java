import java.util.Iterator;

public class MyStack<E> implements Stack<E> {
    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    public MyStack() {
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'peek'");
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'empty'");
    }

    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    // private void grow(){

    // }
}
