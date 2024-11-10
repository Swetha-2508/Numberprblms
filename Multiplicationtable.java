import java.util.Scanner;
class Multiplicationtable
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();
    for(int i=1;i<=10;i++)
    {
      int result=num*i;
      System.out.println(num+" x "+i+" = "+result);
    }
  }
}
    
