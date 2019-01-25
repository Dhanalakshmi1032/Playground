import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner  in = new Scanner(System.in);
      int n=in.nextInt ();
      int d=n;
      int arm=0;
      while(n>0)
        {
     int a= n%10;
      n=n/10;
        arm=arm+a*a*a;
	}
      if(arm==d)
        System.out.println("Armstrong Number ");
      else
        System.out.println("Not a Armstrong Number ");
}
  }