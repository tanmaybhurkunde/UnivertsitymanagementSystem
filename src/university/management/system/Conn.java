
package university.management.system;

import java.sql.*;
public class Conn {
    
    Connection c;
    Statement s ;
    
//    default constructor 
    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystem", "root","T@nm@Y2000") ;
            s = c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
