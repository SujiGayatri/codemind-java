import java.util.*;
public class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        if(c=='V' || c=='v')
        {
            System.out.printf("Violet");
        }
        else if(c=='I' || c=='i')
        {
            System.out.printf("Indigo");
        }
        else if(c=='B' || c=='b')
        {
            System.out.print("Blue");
        }
        else if(c=='G' || c=='g')
        {
            System.out.print("Green");
        }
        else if(c=='Y' || c=='y')
        {
            System.out.print("Yellow");
        }
        else if(c=='O' || c=='o')
        {
           System.out.print("Orange");
        }
        else if(c=='R' || c=='r')
        {
           System.out.print("Red");
        }
        else
        {
            System.out.print("-1");
        }
    }
}