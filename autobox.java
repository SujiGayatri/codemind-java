public class autobox {
    public static void main(String[] args)
    {
          int a=10;
          //Auto-Boxing
          Integer number=a;
          System.out.println(number instanceof Integer);
          //Auto-UnBoxing
          int b=number;
    }
}
