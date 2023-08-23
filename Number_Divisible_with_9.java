import java.util.Scanner;
public class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int s;
        s=sc.nextInt();
        if(s%9==0)
        {
            System.out.printf("True");
        }
        else
        {
            System.out.printf("False");
        }
    }
}