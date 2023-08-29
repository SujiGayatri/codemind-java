import java.util.Scanner;
public class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        if(w==x || w==y || w==z)
        {
            System.out.printf("YES");
        }
        else if(w==x+y || w==x+z || w==y+z)
        {
            System.out.printf("YES");
        }
        else
        {
            System.out.printf("NO");
        }
}
}