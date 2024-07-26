import java.util.Scanner;

public class SumOfn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int evennum=0;
        int odd=0;
        if(number%2==0)
        {
             evennum+=number;
             System.out.print("Sum of EvenNUm"+evennum);
        }
        else{
            odd+=number;
            System.out.print("Sum Of OddNum"+odd);
        }
    }}