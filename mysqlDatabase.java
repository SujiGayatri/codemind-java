import java.sql.Connection;
import java.sql.DriverManager;

public class mysqlDatabase {
     public static void main(String[] args) throws Exception 
   {
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/amitdb", "root", "Suji@9685");
        if(con!=null)
            System.out.println("connection established");
        else
            System.out.println("connection failed");
   }
}


