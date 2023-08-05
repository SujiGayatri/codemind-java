import java.util.Scanner;
public class interest{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,x;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        x=(2*a*b*c*512)/1024;
        System.out.printf("%d KB",x);
    }
}