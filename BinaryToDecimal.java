public class BinaryToDecimal{
    public static void BInToDec(int num)
    {
         
          int pow=0;
            int decimal=0;
       while(num>0)
       {
           
            int LD=num%10;
            decimal=decimal+(LD*(int)Math.pow(2,pow));
            pow++;
            num=num/10;
        }
        System.out.print("decimal of "+num+" binary is "+decimal);
    }
    public static void main(String args[])
    {
       BInToDec(1000);
    }
}
