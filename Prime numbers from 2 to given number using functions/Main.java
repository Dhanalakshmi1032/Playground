import java.util.Scanner;
class Main{
  public static void prime(int n)
    {
    String p=" ";
    for(int i=1;i<=n;i++)
      {
      int counter=0;
      for(int num=i;num>=1;num--)
        {
      if(i%num==0)
        counter++;
        }
      if(counter==2)
        {
       // p=p+i+" ";
        System.out.println(i);
        }
      }
   // System.out.println(p);
    }
    
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt ();
      prime(n);
      
	}
    }
