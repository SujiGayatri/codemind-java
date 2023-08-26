import java.util.Scanner;
public class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int f=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2==0)
            {
                f++;
            }
        }
        if(f==n)
        {
            System.out.printf("True");
        }
        else
        {
            System.out.printf("False");
        }
    }
}