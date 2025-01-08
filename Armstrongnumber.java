import java.util.Scanner;
public class Armstrongnumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);        
        int num,rem,temp,sum=0;
        System.out.println("Enter the number");
        num=sc.nextInt();
        temp=num;
        while(num>0)
        {
            rem=num%10;
            sum=sum+(rem*rem*rem);
            num=num/10;
        }
        if(sum==temp)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not an Armstrong number");
        }
    }
}
