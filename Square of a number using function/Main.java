import java.util.Scanner;
class Main
{
  public static int square (int s)
    {
    int sq=s*s;
    return sq;
    }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in = new Scanner(System.in);
      int n=in.nextInt ();
      int s=square (n);
      System.out.println (s);
      
	} 
}