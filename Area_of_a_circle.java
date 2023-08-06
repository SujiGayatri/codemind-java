import java.util.Scanner;
public class cir{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r;
        double x;
        r=sc.nextInt();
        x=(float)(3.14*r*r);
        System.out.printf("%.2f",x);
    }
}