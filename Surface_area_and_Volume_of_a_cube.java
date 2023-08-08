import java.util.Scanner;
public class div{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a;
        int b,c;
        a=sc.nextInt();
        b=6*a*a;
        c=a*a*a;
        System.out.printf("Surface area = %d and Volume = %d",b,c);
    }
}