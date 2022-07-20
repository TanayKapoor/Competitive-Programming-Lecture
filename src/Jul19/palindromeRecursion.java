package Jul19;

public class palindromeRecursion {
    public static int isPalindrome(int n, int temp) {
        int rev = 0;
        if (n == 0)
            return temp;

        temp = (temp * 10) + (n % 10);
        return isPalindrome(n / 10, temp);
    }

    public static void main(String[] args) {
        int n = 12321;
        int temp = 0;
        int rev = isPalindrome(n, temp);
        if (n == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
}
