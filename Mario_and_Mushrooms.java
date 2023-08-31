import java.util.*;
public class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%3==0)
        {
            System.out.printf("NORMAL");
        }
        else if(n%3==1)
        {
            System.out.printf("HUGE");
        }
        else
        {
            System.out.printf("SMALL");
        }
    }
}