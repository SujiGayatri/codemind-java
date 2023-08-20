import java.util.Scanner;
public class s{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int s=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            s+=a[i];
        }
        double x=(float)s/n;
        System.out.printf("%.2f",x);
    }
}