package jdbc;
import java.sql.*;

/**
 *
 * @author amedi
 */
public class Delete {
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
            /*Loads driver that was previously added to the projects library*/
            Class.forName("com.mysql.cj.jdbc.Driver");
            /* Creates connection, make sure the port is the correct one and that the user and
            password are correct as well*/ 
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/myZoo","root","");
            //Creates a Statement object for sending SQL statements to the database.
            Statement state = connect.createStatement();
            //Returns the number of rows affected by the execution of the SQL statement.
            int regis = state.executeUpdate ("DELETE FROM animals where An_id =1" );
            if (regis == 0)    
            System.out.println ("ID doesn't exist");  
            else
            System.out.println ("Deleted successfully");
            state.close();
            connect.close();         
  }
}
