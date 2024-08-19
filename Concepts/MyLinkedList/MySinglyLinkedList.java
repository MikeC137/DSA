import java.util.Iterator;

public class MySinglyLinkedList<E> implements MyList<E> {

    private Node<E> head; // Reference to the first node
    private int size; // Number of elements in the list

    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    public MySinglyLinkedList(MySinglyLinkedList.Node<E> head, int size) {
        this.head = head;
        this.size = size;
    }

    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    @Override
    public void add(int index, E element) {
        Node<E> current = head;
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds: " + index);
        }
        if (index == 0) {
            addFirst(element);
        } else {
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node<E> newNode = new Node<>(element);
            newNode.next = current.next; // The new node is being added to the list because its next
            // reference is the node after current
            current.next = newNode; // The next reference of the previous object is being changed
            // to point to the newly added object
            size++;
        }

    }

    @Override
    public void addFirst(E e) {
        // The head is not a node. It's a reference to the first node!
        Node<E> newNode = new Node<E>(e);
        newNode.next = head; // The new node points to the current head
        // (the object that the head pointed to before the new node was added
        head = newNode; // Head is updated to point to the first object
        size++;
    }

    @Override
    public void addLast(E e) {
        Node<E> newNode = new Node<E>(e);
        if (head == null) {
            head = newNode;
        } else {
            Node<E> current = head; // Start from the head
            while (current.next != null) { // Traverse until the last node
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    @Override
    public E removeFirst() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFirst'");
    }

    @Override
    public E removeLast() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeLast'");
    }

    @Override
    public E remove(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public E getFirst() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFirst'");
    }

    @Override
    public E getLast() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLast'");
    }

    @Override
    public E get(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public E set(int index, E e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'set'");
    }

}
