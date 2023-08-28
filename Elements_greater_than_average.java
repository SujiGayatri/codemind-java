import java.util.Scanner;
public class s{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int s=0,y=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            s+=a[i];
        }
        int x=s/n;
        for(int i=0;i<n;i++)
        {
            if(a[i]>=x)
            {
                y++;
            }
        }
        System.out.printf("%d",y);
    }
}