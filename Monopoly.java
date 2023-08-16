import java.util.Scanner;
public class climb
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=0;i<x;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a>b+c || b>a+c || c>a+b)
            {
                System.out.printf("YES%n");
            }
            else
            {
                System.out.printf("NO%n");
            }
        }
    }
}