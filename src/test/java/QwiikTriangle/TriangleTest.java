package QwiikTriangle;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lengths of the three sides:");
        int sideX = scanner.nextInt();
        int sideY = scanner.nextInt();
        int sideZ = scanner.nextInt();

        if (sideX == sideY && sideY == sideZ) {
            System.out.println("This triangle is Equilateral");
        } else if (sideX == sideY || sideX == sideZ || sideY == sideZ) {
            System.out.println("This triangle is Isosceles");
        } else {
            System.out.println("This triangle is Scalene");

        }
    }

    public static String classifyTriangle(int sideX, int sideY, int sideZ) {
        if (sideX == sideY && sideY == sideZ) {
            return "Equilateral";
        } else if (sideX == sideY || sideX == sideZ || sideY == sideZ) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}
