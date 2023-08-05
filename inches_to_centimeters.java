import java.util.Scanner;
public class inches{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i;
        double c;
        i=sc.nextInt();
        c=i*2.54;
        System.out.printf("%.2f",c);
    }
}