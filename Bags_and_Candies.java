import java.util.*;
public class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int m=sc.nextInt();
        int y=k*m;
        int x=n/y;
        int z=x+1;
        if(n%y==0)
        {
            System.out.printf("%d",x);
        }
        else
        {
            System.out.printf("%d",z);
        }
    }
}