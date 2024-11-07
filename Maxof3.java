import java.util.Scanner;
class Maxof3
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if (a==b && b==c)
    {
        System.out.println("all are equal");
    }
    else
    {
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("max is a");
            }
            else
            {
                System.out.println("max is c");
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println("max is b");
            }
            else
            {
                System.out.println("max is c");
            }
        }
    }
    }
}
