import java.util.*;
public class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=n/60;
        int m=n%60;
        System.out.printf("%d Hour(s) %d Minute(s)",h,m);
    }
}