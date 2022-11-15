public class palindromenumber {
     static String palindrome(int n)
     {
        int rem=0;
        int rev=0;
        int n1=n;
        while (n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if (rev==n1)
        return "Yes";
        return "No";

     }
    public static void main(String ... args)
    {
        String y=palindrome(121);
        System.out.println(y);
    }
}
