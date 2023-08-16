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
            int c=a/b;
            int d=a%b;
            if(a%b==0)
            {
                System.out.printf("%d%n",c);
            }
            else
            {
                System.out.printf("%d%n",c+d);
            }
        }
    }
}