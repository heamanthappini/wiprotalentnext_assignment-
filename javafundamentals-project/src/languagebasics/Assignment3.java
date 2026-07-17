package languagebasics;

public class Assignment3 {

    public static void main(String[] args) {

        if (args.length == 2) {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
        } else {
            System.out.println("Please pass two integer command line arguments.");
        }

    }
}