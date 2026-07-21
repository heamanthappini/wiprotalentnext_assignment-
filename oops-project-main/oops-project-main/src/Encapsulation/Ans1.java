package Encapsulation;

import java.util.Scanner;

public class Ans1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String authorName = sc.nextLine();
        String email = sc.nextLine();
        char gender = sc.next().charAt(0);

        sc.nextLine();

        String bookName = sc.nextLine();
        double price = sc.nextDouble();
        int qty = sc.nextInt();

        Author a = new Author(authorName, email, gender);
        Book b = new Book(bookName, a, price, qty);

        System.out.println("Book Name : " + b.getName());
        System.out.println("Author Name : " + b.getAuthor().getName());
        System.out.println("Author Email : " + b.getAuthor().getEmail());
        System.out.println("Author Gender : " + b.getAuthor().getGender());
        System.out.println("Price : " + b.getPrice());
        System.out.println("Quantity : " + b.getQtyInStock());

        sc.close();
    }
}
