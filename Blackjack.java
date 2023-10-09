import java.util.*;
public class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int x=21-(m+n);
        if(n+m<21)
        {
            if(1<=x && x<=10)
            {
                System.out.printf("%d",x);
            }
            else
            {
                System.out.printf("-1");
            }
        }
        else
        {
            System.out.printf("-1");
        }
    }
}