import java.util.*;
public class s{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    char c=sc.next().charAt(0);
    if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
    {
        System.out.printf("VOWEL");
    }
    else
    {
        System.out.printf("CONSONANT");
    }
}
}