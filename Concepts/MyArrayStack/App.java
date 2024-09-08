public class App {
    public static void main(String[] args) {
        ArrayStack<String> stack = new ArrayStack<>();

        // Test E push(E item)
        stack.push("Mike");
        stack.push("John");
        stack.push("Tim");
        stack.push("Peter");
        stack.push("Ethan");
        System.out.println(stack.toString());

        // // Test E peek()
        System.out.println(stack.peek().toString());

        // Test E pop()
        System.out.println(stack.pop().toString());
        System.out.println(stack.toString());

        // Test int search(E e)
        int mikePosition = stack.search("Mike");
        int timPosition = stack.search("Tim");
        System.out.println(mikePosition);
        System.out.println(timPosition);

        // Test boolean empty()
        System.out.println(stack.empty());
        stack.clear();
        System.out.println(stack.empty());
    }
}
