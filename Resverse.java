import java.util.*;
public class Resverse{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        while(num!=0)
        {
            rev=num%10;
            num=num/10; 
                 System.out.print(rev);
        } 
    }
}