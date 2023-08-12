import java.util.Scanner;
public class oct{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=(n*(n-1))/2;
        System.out.printf("%d",d);
    }
}