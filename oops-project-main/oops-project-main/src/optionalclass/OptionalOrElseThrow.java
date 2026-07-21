package optionalclass;

import java.util.Optional;
import java.util.Scanner;

class Employee {

    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee ID : " + id + "\nEmployee Name : " + name;
    }
}

class InvalidEmployeeException extends Exception {

    InvalidEmployeeException(String message) {
        super(message);
    }
}

public class OptionalOrElseThrow {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Create Employee? (yes/no): ");
        String choice = sc.next();

        Employee emp = null;

        if (choice.equalsIgnoreCase("yes")) {

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Employee Name: ");
            String name = sc.next();

            emp = new Employee(id, name);
        }

        try {

            Employee e = Optional.ofNullable(emp)
                    .orElseThrow(() ->
                            new InvalidEmployeeException("Employee Object is Null"));

            System.out.println("\nEmployee Details");
            System.out.println(e);

        } catch (InvalidEmployeeException ex) {

            System.out.println(ex.getMessage());

        }

        sc.close();
    }
}