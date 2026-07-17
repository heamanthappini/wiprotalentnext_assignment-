package arrays;

import java.util.Scanner;

public class Ans8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 6) {

                while (arr[i] != 7) {
                    i++;
                }

            } else {

                sum = sum + arr[i];

            }
        }

        System.out.println(sum);

        sc.close();
    }
}