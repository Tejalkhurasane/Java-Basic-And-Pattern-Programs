import java.util.*;
public class OddEven{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number");
        int n=sc.nextInt();
       System.out.println(IsEvenOdd(n));
    }
    public static boolean IsEvenOdd(int n)
    {
    boolean IsEven;
        if(n%2==0)
        {
            IsEven=true;
        }
        else{
            IsEven=false;
        }
        return IsEven;
    }
}
