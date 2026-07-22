import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 255: ");
        int num = sc.nextInt();

        String binary = Integer.toBinaryString(num);

        String result = String.format("%8s", binary).replace(' ', '0');

        System.out.println(result);

        sc.close();
    }
}