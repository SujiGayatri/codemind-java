import java.util.Scanner;
public class tri{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        double s,x;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(float)(a+b+c)/2;
        x=(float)(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
        System.out.printf("%.2f",x);
    }
}