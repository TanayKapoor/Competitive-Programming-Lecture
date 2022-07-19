package Jul19;

import java.util.Scanner;

public class diamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        for (int i = 0; i <= r; i++) {
            for (int j = 1; j <= r - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }

        for (int i = r - 1; i >= 1; i--) {
            for (int j = 1; j <= r - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
