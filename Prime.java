import java.util.*;
public class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c+=1;
            }
        }
        if(c==2)
        {
            System.out.printf("Prime");
        }
        else
        {
            System.out.printf("Not Prime");
        }
    }     
}