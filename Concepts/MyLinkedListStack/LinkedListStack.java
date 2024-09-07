import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedListStack<E> implements Stack<E> {
    private Node<E> top;
    private int size;

    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    @Override
    public E push(E e) {
        Node<E> newElement = new Node<>(e);
        newElement.next = top;
        top = newElement;
        size++;
        return newElement.data;
    }

    @Override
    public E peek() {
        if (empty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    @Override
    public E pop() {
        if (empty()) {
            throw new EmptyStackException();
        }

        E removedElement = top.data;

        top = top.next;
        size--;

        return removedElement;
    }

    @Override
    public int search(E e) {
        if (empty()) {
            throw new EmptyStackException();
        }

        Node<E> current = top;
        int index = 0;
        while (current != null) {
            if (current.data.equals(e)) {
                return size - 1 - index;
            }
            current = current.next;
            index++;
        }

        return -1;
    }

    @Override
    public boolean empty() {
        return size == 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> current = top;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }

                E data = current.data;
                current = current.next;
                return data;
            }

            @Override
            public String toString() {
                if (empty()) {
                    throw new EmptyStackException();
                }

                StringBuilder sb = new StringBuilder();
                Node<E> current = top;

                sb.append("[");
                while (current != null) {
                    sb.append(current.data);
                    if (current.next != null) {
                        sb.append(", ");
                    }

                    current = current.next;
                }

                sb.append("]");
                return sb.toString();
            }
        };
    }
}
