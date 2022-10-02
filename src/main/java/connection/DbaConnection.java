package connection;

import JFrames.MainPlanilla;
import com.mysql.cj.xdevapi.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class DbaConnection {

    private static Connection connection = null;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
    private static final String username = "proyecto";
    private static final String password = "proyecto";
    PreparedStatement ps;
    ResultSet rs;

    public Connection getConnection() throws ClassNotFoundException {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, password);
            return connection;
        } catch (Exception e) {
            String fallida = "No se pudo conectar";
            System.out.println(e);
            JOptionPane.showMessageDialog(null, fallida + "\n" + e);
            return (Connection) e;
        }
    }

}
