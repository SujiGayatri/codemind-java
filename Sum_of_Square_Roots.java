import java.util.*;
public class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double s=0,x;
        for(int i=a;i<=b;i++)
        {
            x=Math.sqrt(i);
            s+=x;
        }
        System.out.printf("%.2f",s);
    }
}