import java.util.Scanner;
class Reverse
{
  public staic void main(String args[])
  {
    int reverse=0,remainder;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();
    while(num!=0)
    {
      remainder=num%10;
      reverse=reverse*10+remainder;
      num=num/10;
    }
    System.out.println(reverse);
  }
}
    
