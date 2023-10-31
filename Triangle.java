import java.util.*;
public class s{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a==b && b==c && c==a)
        {
            System.out.printf("Equilateral triangle");
        }
        else if(a==b || b==c || c==a)
        {
            System.out.printf("Isosceles triangle");
        }
        else
        {
            System.out.printf("Scalene triangle");
        }
    }
}