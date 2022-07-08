import java.util.Scanner;

class perfectNumber{
    perfectNumber(int num){
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                if (i * i != num) {
                    sum += i + num / i;
                } else {
                    sum += i;
                }
            }
        }
        if (sum == num) {
            System.out.println("Perfect number");
        } else {
            System.out.println("Not a perfect number");
        }
    }
}

public class perfectNumberEfficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        new perfectNumber(num);
    }
}
