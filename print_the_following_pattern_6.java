import java.util.Scanner;
public class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=1;j--)
            {
                System.out.printf("%d ",j);
            }
            System.out.printf("
");
        }
    }
}