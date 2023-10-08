import java.util.*;
public class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%3==2)
        {
            System.out.printf("SMALL");
        }
        else if(a%3==0)
        {
            System.out.printf("NORMAL");
        }
        else if(a%3==1)
        {
            System.out.printf("HUGE");
        }
    }
}