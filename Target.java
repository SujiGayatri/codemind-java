import java.util.Scanner;
public class climb
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        if(a>=10 && b>=10 && c>=10 && d>=10)
        {
            System.out.printf("YES");
        }
        else
        {
            System.out.printf("NO");
        }
    }
}