import java.util.*;
public class Pandamic
{
    public static void main(String A[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        if(n==2)
        {
            System.out.print("1");
        }
        else if(n==1)
        {
            System.out.print("0");
        }
        else
        {
            System.out.print("2");
        }
    }
}