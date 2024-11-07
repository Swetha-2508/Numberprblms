import java.util.Scanner;
public class Palindrome {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int remainder,hlo=0,temp;
        temp=num; //temp-stores num value (num value changes in for loop)
        while(num!=0)
        {
            remainder=num%10;
            hlo=hlo*10+remainder;
            num=num/10;
        }
        if(hlo==temp)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}
