import java.util.Scanner; // The last digit of fibonacci series of the nth term
public class Customfibonacci {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp;
        int n1=0,n2=1,n3=0;
        if(n==1)
        {
            n3=1;
        }
        else
        {
            for(int i=1;i<n;i++)
            {
                n3=n1+n2;
                n1=n2;
                n2=n3;
            }
        }
        if(n3>=1&&n3<=9)
        {
            temp=n3;
        }
        else
        {
           temp=n3%10;
        }
        System.out.println(temp);
    }
}
