package classesandobjects;

import java.util.Scanner;

public class Calculator {

    static int powerInt(int num1, int num2) {
        return (int)Math.pow(num1, num2);
    }

    static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = sc.nextDouble();
        int d = sc.nextInt();

        System.out.println(powerInt(a, b));
        System.out.println(powerDouble(c, d));

        sc.close();
    }
}