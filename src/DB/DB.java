package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DB {

    private static final String URL = "jdbc:mysql://localhost:3306/inventory_system";
    private static final String UN = "root";
    private static final String PW = "123";
    private static final String DRIVER = "com.mysql.jdbc.Driver";

    private static Connection con;

    private DB() {}
    
    

    public static synchronized Connection getConnection() {

        try {
            if (con == null) {
                Class.forName(DRIVER);
                con = DriverManager.getConnection(URL, UN, PW);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return con;
    }
    
    
    public static void iud(String q){
    
        try {
            getConnection().createStatement().executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    public static ResultSet search(String q){
        ResultSet rs = null;
        try {
           rs = getConnection().createStatement().executeQuery(q);
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }

}
