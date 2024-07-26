public class DecimalToBinary{
    public static void DecimalToBinary(int num)
    {
          int pow=0;
            int binum=0;
       while(num>0)
       {
           
            int rem=num%2;
            binum=binum+rem*((int)Math.pow(10,pow));
            pow++;
            num=num/2;
        }
        System.out.print("Binary of "+num+" Decimal is "+binum);
    }
    public static void main(String args[])
    {
       DecimalToBinary(8);
    }
}
