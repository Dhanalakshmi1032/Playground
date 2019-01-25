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
    int max;
    if(a[0]>a[1])
      max=0;
    else
      max=1;
   for(int i=2;i<=n-1;i++ )
     {
     if(a[max]<a[i])
       {
       max=i;
       }
     }
    System.out.println (max);
  }
}