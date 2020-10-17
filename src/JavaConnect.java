import java.sql.* ;
import javax.swing.JOptionPane ;

public class JavaConnect {
    Connection conn ;
    
public static Connection connecrDb(){
    try{
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriveManager.getConnection("jdbc:sqlite:E:\\Library management system\\Libarary managment system\\libraryDB.sqlite");
        return conn ;
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null ;
    }
}
} 

