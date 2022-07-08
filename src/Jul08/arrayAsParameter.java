package Jul08;

import java.util.Scanner;

public class arrayAsParameter {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        num = s.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the elements");
        for (int i = 0; i < num; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Sum of first and last element of original is " + (arr[0] + arr[num - 1]));
        updateArray(arr);
        System.out.println("Sum of first and last element of updated array is " + (arr[0] + arr[num - 1]));
    }
    public static void updateArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 10;
        }
    }
}
