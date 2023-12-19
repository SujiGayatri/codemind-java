import java.util.*;
public class EHExample {
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        try{
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println("Buddy you can't divide with 0");
        }
        System.out.println("I will be on the screen");
    }
}