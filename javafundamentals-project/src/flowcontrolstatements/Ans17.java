package flowcontrolstatements;

import java.util.Scanner;

public class Ans17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;
        int rev = 0;

        while (n != 0) {

            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        if (temp == rev) {
            System.out.println(temp + " is a palindrome");
        } else {
            System.out.println(temp + " is not a palindrome");
        }

        sc.close();
    }
}