package flowcontrolstatements;

import java.util.Scanner;

public class Ans1b {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a % 10 == b % 10);
    }
}