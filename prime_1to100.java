public class prime_1to100 {
    public static void main(String args[])
    {
        for(int i=2;i<=100;i++)
        {
            if(isprime(i))
            {
                System.out.println(i+" ");
            }
        }
    }
    static boolean isprime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
