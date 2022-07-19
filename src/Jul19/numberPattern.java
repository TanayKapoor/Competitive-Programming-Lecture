package Jul19;

import java.util.Scanner;

public class numberPattern {
    public static void main(String[] args) {
        int a = 0, b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.printf("%d%s", ++a, "*");
            }
            for (int l = 1; l <= i; l++) {
                System.out.printf("%d", ++b + i * i);
                if (l != i) {
                    System.out.printf("*");
                }
            }
            System.out.println();
        }
    }
}
