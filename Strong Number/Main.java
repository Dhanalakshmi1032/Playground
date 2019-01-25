import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner  in = new Scanner(System.in);
       int n= in.nextInt ();
      int d=n,sum=0;
      while(n!=0)
        {
        int p=1;
       int r= n%10;
        for(int i=1;i<=r;i++)
          {
          p=p*i;
          }
        sum=sum+p;
        n=n/10;
        }
      if(sum==d)
        System.out.println("Yes");
      else 
        System.out.println("No");
        
	}
}