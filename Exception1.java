
class tooYoungException extends RuntimeException{
    public tooYoungException(String e)
    {
        super(e);
    }
}
class tooOldException extends RuntimeException{
    public tooOldException(String e)
    {
        super(e);
    }
}
public class Exception1 {
    public static void main(String[] args)
    {
        int age=Integer.parseInt(args[0]);
        try{
            if(age<18)
            {
                throw new tooYoungException("You are too Young");
            }
            else if(age>60)
            {
                throw new tooOldException("You are too Old");
            }
            else
            {
                System.out.println("You are eligible");
            }
        }
        catch(tooYoungException ye)
        {
            System.out.println(ye);
        }
        catch(tooOldException oe)
        {
            System.out.println(oe);
        }
    }
}
