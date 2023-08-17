import java.util.Scanner;
public class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x%3==0 && x%5==0)
        {
            System.out.printf("PlingPlang");
        }
        else if(x%3==0)
        {
            System.out.printf("Pling");
        }
        else if(x%5==0)
        {
            System.out.printf("Plang");
        }
        else if(x%7==0)
        {
            System.out.printf("Plong");
        }
        else
        {
            System.out.printf("%d",x);
        }
    }
}