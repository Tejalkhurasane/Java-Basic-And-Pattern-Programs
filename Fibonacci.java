import java.util.*;
public class Fibonacci{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number");
        int num=sc.nextInt();
        int a=0,b=1,nextnum=0;
       for(int i=1;i<=num;i++)
        {
         System.out.print(a+" ");
         nextnum=a+b;
         a=b;
         b=nextnum;
        }
        
    }
}