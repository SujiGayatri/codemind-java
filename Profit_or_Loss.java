import java.util.Scanner;
public class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int cp,sp;
        cp=sc.nextInt();
        sp=sc.nextInt();
        if(cp>sp)
        {
            System.out.printf("Loss");
        }
        else if(cp<sp)
        {
            System.out.printf("Profit");
        }
        else
        {
            System.out.printf("No profit and No loss");
        }
    }
}