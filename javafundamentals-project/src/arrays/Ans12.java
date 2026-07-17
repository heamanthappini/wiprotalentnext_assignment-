package arrays;

import java.util.Scanner;

public class Ans12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[3];
        int[] b = new int[3];
        int[] c = new int[2];

        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            b[i] = sc.nextInt();
        }

        c[0] = a[1];
        c[1] = b[1];

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }

        sc.close();
    }
}