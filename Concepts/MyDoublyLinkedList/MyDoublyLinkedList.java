import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyDoublyLinkedList<E> implements MyList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    private class doublyLinkedListIterator implements Iterator<E> {
        private Node<E> current;

        public doublyLinkedListIterator() {
            this.current = head;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (current == null) {
                throw new NoSuchElementException();
            }

            E data = current.data;
            Node<E> lastReturnedNode = current;
            current = current.next;

            return data;
        }

    }

    private static class Node<E> {
        private E data;
        private Node<E> next;
        private Node<E> previous;

        public Node(E data) {
            this.data = data;
            next = null;
            previous = null;
        }

    }

    public MyDoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void addFirst(E e) {
        Node<E> newElement = new Node<E>(e);
        newElement.next = head;

        if (!isEmpty()) {
            head.previous = newElement;
        }

        head = newElement;

        if (isEmpty()) {
            tail = newElement;
        }

        newElement.previous = null;

        size++;
    }

    @Override
    public void addLast(E e) {
        if (isEmpty()) {
            addFirst(e);
        } else {
            Node<E> newElement = new Node<E>(e);

            newElement.previous = tail;
            tail.next = newElement;
            tail = newElement;

            size++;
        }
    }

    @Override
    public void add(int index, E e) {
        isIndexValid(index);
        if (index == 0) {
            addFirst(e);
        } else if (index == size) {
            addLast(e);
        } else {
            Node<E> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Node<E> newElement = new Node<E>(e);

            newElement.previous = current.previous;
            newElement.next = current;

            current.previous.next = newElement;
            current.previous = newElement;
        }
        size++;
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("The list is empty");
        }
        Node<E> oldElement = head;
        if (head.next == null) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.previous = null;
        }
        size--;
        return oldElement.data;
    }

    @Override
    public E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Node<E> oldElement = tail;
        if (head.next == null) {
            head = null;
            tail = null;
        } else {
            tail = tail.previous;
            tail.next = null;
        }
        size--;
        return oldElement.data;
    }

    @Override
    public E remove(int index) {
        isIndexValid(index);

        if (head.next == null) {
            return removeFirst();
        } else if (index == size - 1) {
            return removeLast();
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        Node<E> oldElement = current;

        current.previous.next = current.next;
        current.next.previous = current.previous;

        size--;
        return oldElement.data;
    }

    @Override
    public boolean remove(Object o) {
        int indexOfOldElement = indexOf(o);

        if (indexOfOldElement == -1) {
            return false;
        }

        remove(indexOfOldElement);

        return true;
    }

    @Override
    public E getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        return head.data;
    }

    @Override
    public E getLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        return tail.data;
    }

    @Override
    public E get(int index) {
        isIndexValid(index);

        Node<E> current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    @Override
    public E set(int index, E e) {
        isIndexValid(index);

        Node<E> current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        E oldData = current.data;
        current.data = e;

        return oldData;
    }

    @Override
    public boolean contains(Object o) {
        if (isEmpty()) {
            return false;
        }

        Node<E> current = head;

        for (int i = 0; i < size; i++) {
            if (o == null ? current.data == null : o.equals(current.data)) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    @Override
    public int indexOf(Object o) {
        Node<E> current = head;

        for (int i = 0; i < size; i++) {
            if (o == null ? current.data == null : current.data.equals(o)) { // Besides checking
                // whether current.data is equal to o, this statement also ensures that the
                // method can correctly handle 'null' values. It checks if o is null and if so,
                // it compares current.data to null. If current.data is null and you call
                // current.data.equals(o), it will throw a NullPointerException.
                return i;
            }

            current = current.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {

        Node<E> current = tail;
        for (int i = size - 1; i >= 0; i--) {
            if (current.data == null ? o == null : current.data.equals(o)) {
                return i;
            }
            current = current.previous;
        }

        return -1;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new doublyLinkedListIterator();
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("[");
        Node<E> current = head;

        while (current != null) {
            string.append(current.data);
            if (current.next != null) {
                string.append(", ");
            }
            current = current.next;
        }

        string.append("]");

        return string.toString();
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return true;
    }

    public void isIndexValid(int index) {
        if (index < 0 || index > size) { // Validate index
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }
}
