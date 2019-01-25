import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in =new Scanner(System.in);
      int n=in.nextInt ();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        {
        a[i]=in.nextInt ();
        }
      int search1=in.nextInt ();
      int search2=in.nextInt ();
      int ele1=-1;
      int ele2=-1;
      for(int i=0;i<n ;i++)
        {
        if(search1==a[i])
          ele1=i;
        if(search2==a[i] )
          ele2=i;
        }
      System.out.println(ele1);
      System.out.println (ele2);
    }
}