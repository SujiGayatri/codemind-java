import java.util.Scanner;
public class average{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        double c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=(a+b)/2.0;
        System.out.printf("Average of %d and %d is: %.2f",a,b,c);
    }
}