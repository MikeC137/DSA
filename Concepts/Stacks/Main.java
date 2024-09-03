import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        System.out.println(stack.empty());

        stack.push("RDR 2");
        stack.push("GTA V");
        stack.push("Elden Ring");
        stack.push("God of War");
        stack.push("Indiana Jones");

        System.out.println(stack.empty());
        System.out.println(stack);

        String myFavGame = stack.pop();
        System.out.println(stack);
        System.out.println(myFavGame);

        System.out.println(stack.peek());
        System.out.println(stack);

        System.out.println(stack.search(myFavGame));
        System.out.println(stack.search("GTA V"));
    }
}
