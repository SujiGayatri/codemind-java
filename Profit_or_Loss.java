import java.util.*;
public class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(n<m)
        {
            System.out.printf("Profit");
        }
        else if(n==m)
        {
            System.out.printf("No Profit and No Loss");
        }
        else
        {
            System.out.printf("Loss");
        }
    }
}