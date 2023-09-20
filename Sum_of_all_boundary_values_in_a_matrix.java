import java.util.*;
public class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] a=new int[r][c];
        int s=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
                if(i==0 || i==r-1 || j==0 || j==c-1)
                {
                    s+=a[i][j];
                }
            }
        }
        System.out.println(s);
    }
}