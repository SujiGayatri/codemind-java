import java.util.Scanner;
public class avrg
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        double x;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        x=Math.sqrt((c-a)*(c-a)+(d-b)*(d-b));
        System.out.printf("%.4f",x);
    }
}