import java.util.Scanner;

class Jun30PS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < num; i++) {
            if (i % num == 0) {
                i += sum;
            }
        }
        if (sum == num) {
            System.out.println("Perfect number");
        } else {
            System.out.println("Not a perfect number");
        }
    }
}