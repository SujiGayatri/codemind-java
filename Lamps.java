import java.util.Scanner;
public class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int a=k*x;
        int b=n-k;
        int c=(b*y)+a;
        int d=a+(b*x);
        if(x>y)
        {
        if(n==k)
        {
            System.out.printf("%d",a);
        }
        else
        {
            System.out.printf("%d",c);
        }
        }
        else
        {
            if(n==k)
            {
                System.out.printf("%d",a);
            }
            else
            {
                System.out.printf("%d",d);
            }
        }
    }
}