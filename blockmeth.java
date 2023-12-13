import java.net.SocketTimeoutException;

public class blockmeth {
    public static void main(String[] args)
    {
        int a=10;
        {
            int b=40;
            {
                int c=90;
                System.out.println(c);
            }
            System.out.println(b);
            System.out.println(a);
        }
        System.out.println(a);
    }
}
