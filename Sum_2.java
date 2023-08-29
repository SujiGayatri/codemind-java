import java.util.Scanner;
public class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int s=0;
        if(a<b)
        {
            for(int i=a;i<=b;i++)
            {
                if(i%x==0 && i%y!=0)
                {
                    s+=i;
                }
            }
            System.out.printf("%d",s);
        }
        
}
}