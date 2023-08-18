import java.util.Scanner;
public class c{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,t,s=0,r;
        n=sc.nextInt();
        t=n;
        while(t!=0)
        {
            r=t%10;
            s=s*10+r;
            t=t/10;
        }
        if(n==s)
        {
            System.out.printf("Palindrome");
        }
        else
        {
            System.out.printf("Not Palindrome");
        }
    }
}