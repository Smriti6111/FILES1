package ConnectionPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDataBase {
    private static Connection con;

    public static Connection getConnection() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/traindb", "root", "Darshan@582857");
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        return con;


}
}
