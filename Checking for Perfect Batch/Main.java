import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in =new Scanner(System.in);
    int n=in.nextInt ();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=in.nextInt ();
    Perfect (a,n);
    
  }
  public static void Perfect (int a[],int n)
    {
  boolean is_perfect =true;
    int sum=a[0]+a[1]+a[2];
    for(int i=3;i<n;i=i+3)
      {
     int cur_sum=a[i]+a[i+1]+a[i+2];
      if(cur_sum!=sum)
        {
        is_perfect =false;
        }
     }
    if(is_perfect ==true)
      System.out.println ("Perfect Batch");
    else
      System.out.println ("Not a Perfect Batch ");
  }
}