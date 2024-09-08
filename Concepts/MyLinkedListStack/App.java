import java.util.Iterator;
import java.util.NoSuchElementException;

public class App {
    public static void main(String[] args) {
        LinkedListStack<String> stack = new LinkedListStack<>();

        // Test E push(E item)
        stack.push("Mike");
        System.out.println(stack);
        stack.push("Tim");
        stack.push("John");
        System.out.println(stack);

        // Test E peek()
        System.out.println(stack.peek());

        // Test E pop()
        stack.pop();
        System.out.println(stack.toString());
        System.out.println(stack.peek());

        // Test int search(E e)
        System.out.println(stack.search("Tim"));
        System.out.println(stack.search("Mike"));

        // Test boolean hasNext()
        Iterator<String> iterator = stack.iterator();
        System.out.println(iterator.hasNext());

        LinkedListStack<String> emptyStack = new LinkedListStack<>();
        Iterator<String> emptyIterator = emptyStack.iterator();
        System.out.println(emptyIterator.hasNext());

        // Test E next
        try {
            emptyIterator.next(); // Should throw NoSuchElementException
        } catch (NoSuchElementException e) {
            System.out.println("Caught expected exception: " + e);
        }
        System.out.println(iterator.next().toString());

        // Test empty()
        System.out.println(emptyStack.empty());
        System.out.println(stack.empty());
    }
}
