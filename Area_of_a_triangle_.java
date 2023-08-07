import java.util.Scanner;
public class avrg
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,x;
        a=sc.nextInt();
        b=sc.nextInt();
        x=(a*b)/2;
        System.out.printf("%d",x);
    }
}