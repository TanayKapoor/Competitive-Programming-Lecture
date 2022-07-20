package assignments;

public class maxAndMin {
    public static void minRecursive(int[] arr, int n) {
        if (n == 0)
            return;
        if (arr[n] < arr[n - 1])
            minRecursive(arr, n - 1);
        else
            System.out.println(arr[n]);
    }

    public static void maxRecursive(int[] arr, int n) {
        if (n == 0)
            return;
        if (arr[n] > arr[n - 1])
            maxRecursive(arr, n - 1);
        else
            System.out.println(arr[n]);
    }

    public static void main(String[] args) {
        int[] arr = {7, 11, 4, 8, 9, 52};
        System.out.print("Maximum element in the array is: ");
        minRecursive(arr, arr.length - 1);
        System.out.print("Minimum element in the array is: ");
        maxRecursive(arr, arr.length - 1);

    }
}
