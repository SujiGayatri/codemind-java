import java.util.Scanner;
public class tri
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a+b>c)
        {
            System.out.printf("Valid triangle");
        }
        else if(a+c>b)
        {
            System.out.printf("Invalid triangle");
        }
    }
}