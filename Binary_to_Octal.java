import java.util.Scanner;
public class j{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=0;i<x;i++)
        {
            String a=sc.next();
            int b=Integer.parseInt(a,2);
            System.out.printf(Integer.toString(b,8));
            System.out.printf("%n");
        }
    }
}