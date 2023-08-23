import java.util.Scanner;
public class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int s;
        s=sc.nextInt();
        if(s>20)
        {
            System.out.printf("HOT");
        }
        else
        {
            System.out.printf("COLD");
        }
    }
}