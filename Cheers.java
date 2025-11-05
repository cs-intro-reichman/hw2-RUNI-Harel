//feedback

/*
Great work boaz!
*/

// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                // Replace this comment with your code
                String input = args[0];
                int num = Integer.parseInt(args[1]);
                input = input.toUpperCase();
                // System.out.println(input);
                String anLetters = "AEFHILMNORSX";

                for (int i = 0; i < input.length(); i++) {
                        if (anLetters.indexOf(input.charAt(i)) != -1) {
                                System.out.println("Give me an " + input.charAt(i) + ": " + input.charAt(i) + "!");
                        } else {
                                System.out.println("Give me a " + input.charAt(i) + ": " + input.charAt(i) + "!");
                        }
                        // System.out.println(input.indexOf("e"));
                }
                System.out.println("What does that spell?");

                for (int i = 0; i < num; i++) {
                        System.out.println(input + "!!!");
                }
        }
}
