import java.util.*;
public class SumOfInt{
    public static void main(String args[])
    {
            Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number");
        int n=sc.nextInt();
         System.out.print("Sum Of Integer"+Sumofint(n));
    }
    public static int Sumofint(int n)
    {
          int sum=0;
        while(n!=0){
      
        int LD=n%10;
        sum+=LD;
        n/=10;
        }
        return sum;
    }
}