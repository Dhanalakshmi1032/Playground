import java.util.Scanner;
class Main{
  public static int add(int n)
    {
    int su=(n*(n+1))/2;
    return su;
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner  in=new Scanner(System.in);
      int n=in.nextInt ();
      int sum=add(n);
      System.out.println (sum);
	}
}