package classesandobjects;

import java.util.Scanner;

public class Box {

    double width;
    double height;
    double depth;

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double getVolume() {
        return width * height * depth;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double width = sc.nextDouble();
        double height = sc.nextDouble();
        double depth = sc.nextDouble();

        Box b = new Box(width, height, depth);

        System.out.println(b.getVolume());

        sc.close();
    }
}