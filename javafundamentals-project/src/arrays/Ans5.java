package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ans5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Smallest: " + arr[0] + " " + arr[1]);
        System.out.println("Largest: " + arr[arr.length - 2] + " " + arr[arr.length - 1]);
    }
}
