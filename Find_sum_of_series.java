import java.util.Scanner;
public class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double s=0;
        for(int i=1;i<=n;i++)
        {
            s+=(1.0/i);
        }
        System.out.printf("%.2f",(float)s);
    }
}