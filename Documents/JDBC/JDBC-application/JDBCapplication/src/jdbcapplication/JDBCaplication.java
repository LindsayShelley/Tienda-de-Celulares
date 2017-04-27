/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcapplication;
import java.sql.*;
/**
 *
 * @author lindsay
 */
public class JDBCaplication {
    

 public static void main(String[] args) {
try {
     
     Class.forName("org.postgresql.Driver");
            System.out.println("Carga exitosa");
            String url = "jdbc:postgresql://localhost/nombres?user=linsi&password=shelley";
           Connection conn = DriverManager.getConnection(url);
            System.out.println("Conexion realizada");
            Statement st = conn.createStatement();
            st.execute("insert into "+
                    " usuarios (id,nombre,paterno,materno) "+
                    " values(05,'lindsay','de la cruz','jimenez')");
          
            conn.close();
          
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: Controlador");
            System.exit(1);

        } catch (SQLException ex) {
            System.out.println("Error: Conexion");
        ex.printStackTrace();
        }

    }
}
