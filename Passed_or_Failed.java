import java.util.*;
public class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        int x3=sc.nextInt();
        int x4=sc.nextInt();
        int x5=sc.nextInt();
        if(x1>=34 && x2>=34 && x3>=34 && x4>=34 && x5>=34)
        {
            System.out.printf("PASSED");
        }
        else
        {
            System.out.printf("FAILED");
        }
    }
}