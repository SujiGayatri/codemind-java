import java.util.Scanner;
public class sum{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=(n*(n+1))/2;
        System.out.println(m);
    }
}