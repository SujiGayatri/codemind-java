import java.util.Scanner;
public class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int f=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                if(i%2!=0)
                {
                    f=1;
                }
            }
        }
        if(f==1)
        {
            System.out.printf("False");
        }
        else
        {
            System.out.printf("True");
        }
    }
}