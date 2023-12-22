import java.util.*;
public class primesInRange {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c;
        for(int i=n;i<=m;i++)
        {
            c=0;
            for(int j=1;j<=i;j++)
            {
                if(j%i==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                System.out.println(i+" ");
            }
        }
    }
}
