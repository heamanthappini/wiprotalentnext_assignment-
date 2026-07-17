package arrays;

public class Ans1 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        double avg = (double) sum / n;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }
}
