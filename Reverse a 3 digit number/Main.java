import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int n1 = num%10;
    int n2 = (num%100)/10;
    int n3 = num/100;
    System.out.print(n1);
    System.out.print(n2);
    System.out.print(n3);
  }
}