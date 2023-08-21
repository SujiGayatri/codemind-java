import java.util.Scanner;
public class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int s=0;
        for(int i=0;i<n;i++)
        {
            s+=a[i];
        }
        double x=(int)s/n;
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<=x)
            {
               c+=1; 
            }
        }
        System.out.printf("%d",c);
    }
}