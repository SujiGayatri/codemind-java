import java.util.Scanner;
public class c{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       int n,i,j;
       n=sc.nextInt();
       for(i=0;i<n;i++)
       {
           for(j=0;j<=i;j++)
           {
               System.out.printf("*");
           }
           System.out.printf("%n");
       }
    }
}