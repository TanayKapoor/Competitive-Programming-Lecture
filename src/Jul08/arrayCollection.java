package Jul08;

import java.util.Arrays;
import java.util.Scanner;

public class arrayCollection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split("[,\\[\\]]")).filter(w -> !w.equals("")).mapToInt(Integer::parseInt).toArray();
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
