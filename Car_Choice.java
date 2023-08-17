import java.util.Scanner;
public class c{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int x1=sc.nextInt();
            int x2=sc.nextInt();
            int y1=sc.nextInt();
            int y2=sc.nextInt();
            double a=(float)y1/x1;
            double b=(float)y2/x2;
            if(b>a)
            {
                System.out.printf("-1%n");
            }
            else if(a==b)
            {
                System.out.printf("0%n");
            }
            else
            {
                System.out.printf("1%n");
            }
        }
    }
}