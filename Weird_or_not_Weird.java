import java.util.Scanner;
public class s{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2!=0)
        {
            System.out.printf("weird");
        }
        else if(n%2==0 && 2<=n && n<5)
        {
            System.out.printf("not weird");
        }
        else if(n%2==0 && 6<=n && n<20)
        {
            System.out.printf("weird");
        }
        else if(n%2==0 && n>20)
        {
            System.out.printf("not weird");
        }
    } 
}