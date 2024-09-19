package DataBaseConnection;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NguyenCongHoan
 */
public class DataBaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/sneakers";
    private static final String USER_NAME = "root";
    private static final String PASS_WORD = "";
    
    public static Connection getConnection() throws ClassNotFoundException {
        Connection cnt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnt = DriverManager.getConnection(URL, USER_NAME, PASS_WORD);
            System.out.println("Ket noi thanh cong !");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return cnt;
    }
}
