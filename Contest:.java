import java.util.Scanner;
public class con
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x,a,b,c;
        x=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        c=1*a+2*b;
        if(c>=x)
        {
            System.out.printf("Qualify");
        }
        else
        {
            System.out.printf("Not Qualify");
        }
    }
}