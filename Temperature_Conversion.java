import java.util.Scanner;
public class avrg
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int c;
        double x;
        c=sc.nextInt();
        x=32+(c*1.8);
        System.out.printf("%.2f",x);
    }
}