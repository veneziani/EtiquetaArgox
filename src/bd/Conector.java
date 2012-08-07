package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {

    public static Connection conectar() {
        String driver = "org.firebirdsql.jdbc.FBDriver";

        try {
            Class.forName(driver).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:firebirdsql:192.168.10.1/3050:/sistemas/bd.gdb", "SYSDBA", "masterkey");

            return con;
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("Verifique a conexão com o banco de dados");
            return null;
        }

    }
}
