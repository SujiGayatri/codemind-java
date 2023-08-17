import java.util.Scanner;
public class c{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int a=x-y*2;
        if(x==0 && y%2==0)
        {
            System.out.printf("YES");
        }
        else if(x==0 && y%2!=0)
        {
            System.out.printf("NO");
        }
        else if(a%2==0)
        {
            System.out.printf("YES");
        }
        else
        {
            System.out.printf("NO");
        }
    }
}