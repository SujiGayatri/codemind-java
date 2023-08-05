import java.util.Scanner;
public class average{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x,a,b,c;
        x=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        c=x*3-a-b;
        System.out.printf("%d",c);
    }
}