import java.util.Scanner;
class Main
  {
  public static int power (int base,int exponent)
    {
    int pow = base;
     for(int i=1;i<exponent;i++)  
       pow = pow *base;
         
    return pow;
    }
  public static void main (String[] args)
    {
    Scanner in=new Scanner(System.in);
    int b=in.nextInt ();
    int e=in.nextInt ();
    int p=power (b,e);
    System.out.println (p);
    }
  }