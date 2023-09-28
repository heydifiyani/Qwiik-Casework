package QwiikFibonacci;

import java.util.Scanner;

    public class FibonacciTest {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter total generate number:");
            int n = scanner.nextInt();

            if (n < 2) {
                System.out.println("Please input greater then 2");

            } else {
                int[] Qwiikfibonacci = new int[n];
                Qwiikfibonacci[0] = 0;
                Qwiikfibonacci[1] = 1;


                for (int i = 2; i < n; i++) {
                    Qwiikfibonacci[i] = Qwiikfibonacci[i - 1] + Qwiikfibonacci[i - 2];

                }

                for (int i = 0; i < n; i++) {
                    System.out.print(Qwiikfibonacci[i] + " ");
                }

            }
        }
}
