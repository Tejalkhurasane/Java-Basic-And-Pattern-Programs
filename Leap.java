import java.util.*;

public class Leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int rev=0;
      if(number%400==0 || (number%4==0 && number%100!=0))
        {
            System.out.print("leap year");
        }
        else
        {
            System.out.print("not leap year");
        }
    }
}