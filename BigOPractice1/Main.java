// public class Main {
//     public static void main(String[] args) {
//         int[] input = {1, 2, 3, 4, 5}; // Example input array O(1)
//         System.out.println(funChallenge(input)); //O(1)
//     }

//     public static int funChallenge(int[] input) {
//         int a = 10; //O(1)
//         a = 50 + 3; //O(1)

//         for (int i = 0; i < input.length; i++) { //O(n)
//             anotherFunction(); //O(1)
//             boolean stranger = true; //O(1)
//             a++; //O(1)
//         }
//         return a; //O(1)
//     }

//     public static void anotherFunction() {
//         // Implementation of anotherFunction
//         // You can fill this in with the desired functionality

//     }
// }


public class Main {
    public static void main(String[] args) { 
        int input = 5; // Example input value O(1)
        anotherFunChallenge(input); //O(1)
    }

    public static void anotherFunChallenge(int input) {
        int a = 5; //O(1)
        int b = 10; //O(1)
        int c = 50; //O(1)

        for (int i = 0; i < input; i++) { //O(n)
            int x = i + 1; //O(1)
            int y = i + 2; //O(1)
            int z = i + 3; //O(1)
        }

        for (int j = 0; j < input; j++) { //O(n)
            int p = j * 2; //O(1)
            int q = j * 2; //O(1)
        }

        String whoAmI = "I don't know"; //O(1)
    }
}