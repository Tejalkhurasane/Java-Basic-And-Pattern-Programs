import java.util.*;
public class Avg3Num{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a 3 Numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
    
        System.out.println("The avg value is"+avg(x,y,z));

    }
    public static int avg(int x,int y, int z)
{
    return (x+y+z)/3;
}
}