package optionalclass;

import java.util.Optional;
import java.util.Scanner;

public class OptionalOrElse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Address (or type null): ");
        String address = sc.nextLine();

        if (address.equalsIgnoreCase("null")) {
            address = null;
        }

        String result = Optional.ofNullable(address).orElse("India");

        System.out.println(result);

        sc.close();
    }
}