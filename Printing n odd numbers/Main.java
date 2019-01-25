import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      for(int i=0;n!=0;i++)
        {
        if(i%2!=0)
          {
          System.out.println(i);
          n--;
          }
        }
	}
      
}