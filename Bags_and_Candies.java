import java.util.Scanner;
public class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=b*c;
        if(a%d==0)
        {
            System.out.printf("%d",(a/d));
        }
        else
        {
            System.out.printf("%d",(a/d)+1);
        }
    }
}