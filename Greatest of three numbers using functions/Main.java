import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1=in.nextInt ();
      int n2=in.nextInt ();
      int n3=in.nextInt ();
      System.out.println (great (n1,n2,n3));
      
	}
  public static int great(int n1, int n2,int n3)
    {
    int max;
    if (n1>n2)
      max=n1;
    else 
      max=n2;
    if(max<n3)
      max=n3;
    return max;
    }
}