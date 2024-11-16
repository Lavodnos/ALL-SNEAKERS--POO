 
package MODELO;
 
 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
 
 
 
public class CONEXION {
 
private Connection con=null;
        
        public Connection getConexion(){
            try {
                Class.forName("com.mysql.jdbc.Driver"); 
              Class.forName("org.gjt.mm.mysql.Driver");//.newInstance();
               con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sql-poo","root","");
     
            } catch (SQLException e) {
                System.err.println(e);
            JOptionPane.showMessageDialog(null, " conexion de la base de datos");
        
                
            } catch (ClassNotFoundException ex){
                Logger.getLogger(CONEXION.class.getName()).log(Level.SEVERE,null, ex);
             JOptionPane.showMessageDialog(null, "no  conexion de la base de datos");
            }
            return con;
        }
    
}
    