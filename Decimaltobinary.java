import java.util.Scanner;
class decimaltobinary
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int decimal=sc.nextInt();
        int binarynumber=0;
        int remainder,i=1;
        while(decimal!=0)
        {
            remainder=decimal%2;
            decimal=decimal/2;
            binarynumber+=remainder*i;
            i=i*10;
        }
        int num_count=binarynumber;
        int count=0;
        while(num_count!=0)
        {
            count++;
            num_count=num_count/10;
        }
        int requiredzeros=8-count;
        for(int j=0;j<requiredzeros;j++)
        {
            System.out.print("0");
        }
        System.out.println(binarynumber);
    }
}
