import java.util.Scanner;
class Primenumber
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number and check whether it is prime or not");
        int num=sc.nextInt();
        int a=0,b;
        b=num/2;// after num/2 the next factor is num itself
        if(num==1||num==0)
        {
            System.out.println(num+ " is not a prime number");
        }
        else{
            for(int i=2;i<=b;i++)
            {
                if(num%i==0)
                {
                    System.out.println(num + " is not a prime number");
                    a=1;
                    break;
                }
            }
        }
        if(a==0)
        {
            System.out.println(num + " is a prime number");
        }
    }
}
