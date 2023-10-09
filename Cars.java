import java.util.*;
public class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=n/4;
        if(n%4==0)
        {
            System.out.printf("%d",x);
        }
        else
        {
            System.out.printf("%d",x+1);
        }
    }
}