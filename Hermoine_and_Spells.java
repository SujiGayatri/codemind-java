import java.util.*;
public class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b>b+c && a+b>a+c)
        {
            System.out.printf("%d",a+b);
        }
        else if(b+c>a+b && b+c>a+c)
        {
            System.out.printf("%d",b+c);
        }
        else
        {
            System.out.printf("%d",a+c);
        }
    }
}