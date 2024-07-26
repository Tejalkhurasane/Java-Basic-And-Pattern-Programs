import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        if (isPalindrome(n)) {
            System.out.print("isPalindrome");
        } else {
            System.out.print("isNotPalindrome");
        }
    }

    public static boolean isPalindrome(int num) {
        int originalNum = num; // Store the original number
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return originalNum == reversed;
    }
}
