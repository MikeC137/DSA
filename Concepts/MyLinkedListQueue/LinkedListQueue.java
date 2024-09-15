public class LinkedListQueue<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public LinkedListQueue() {
        head = null;
        tail = null;
        size = 0;
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
}
