/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Wishwa Prabodha
 */
public class DataAccess {

    static String  driver = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/book";
    static String user = "root";
    static String password = "";

    public static Connection connect() {

        Connection con = null;

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return con;
    }

}
