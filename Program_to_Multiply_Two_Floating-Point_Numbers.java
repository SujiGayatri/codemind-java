import java.util.Scanner;
public class avrg
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double a,b,x;
        a=sc.nextFloat();
        b=sc.nextFloat();
        x=a*b;
        System.out.printf("%.2f",x);
    }
}