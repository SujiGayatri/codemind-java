// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;
public class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int x=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
            {
                x+=1;
            }
        }
        System.out.printf("%d",x);
    }
}