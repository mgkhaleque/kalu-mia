package DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Driver {
    public static void main(String[] args) {
            //1. Get a connection to database
            //Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDatabase","root", "1234" );
             String url="jdbc:mysql://localhost:3306/myDatabase?autoReconnect=true&useSSL=false";
             String user="root";
             String password="1234";
        try {
            Connection myCon = DriverManager.getConnection(url, user, password);//1. establish connection
            Statement myStmt = myCon.createStatement(); //2. Create Statement
            String sql = "SELECT * FROM myDatabase.achillis";//3.execute SQl query
            ResultSet rs = myStmt.executeQuery(sql);//4. process the result set
            // we need to create a while loop to go thru our result set and printout
            // the names of the people in database
            while (rs.next()) //while>press ctl+shift+space
                System.out.println(rs.getString("name"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


