import java.util.Scanner;
public class Ap{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,e,f,g;
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        d=a-b;
        e=a*b;
        f=a/b;
        g=a%b;
        System.out.printf("Sum:%d%n",c);
        System.out.printf("Difference:%d%n",d);
        System.out.printf("Product:%d%n",e);
        System.out.printf("Quotient:%d%n",f);
        System.out.printf("Remainder:%d%n",g);
    }
}