 
package MODELO;
 ///HEREDAMOS LA CLASE CONEXION
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
 


public class DAO_ADMINISTRADOR extends CONEXION{
                       
////-----------------------*****---------------------------CONSULTAS USUARIO-------------------------------*****------------------------
 
     //VALIDAR  USUARIOS......................................................................................
        public USUARIO Validar(USUARIO USU){
                Connection con = getConexion () ;
                PreparedStatement ps = null ;
                ResultSet rs=null;

                String sqlValidarr="SELECT IDUSER, ID_Rol, USER, NAME, PASS FROM userr\n" +
            "WHERE USER=? and PASS=?";

                try {

                                ps=con.prepareStatement(sqlValidarr);
                                ps.setString(1, USU.getUSERU());
                                ps.setString(2, USU.getPASSU());
                                 rs=ps.executeQuery();
                if (rs.next()) {
                USU.setIDUSERU(rs.getString("IDUSER"));
                USU.setID_RolU(rs.getInt("ID_Rol"));
                 USU.setUSERU(rs.getString("USER"));
                USU.setNAMEU(rs.getString("NAME"));
               

     
    
    }
    } catch (Exception e) {
     
    }
    return USU;
    }    
    //CREAR USUARIO......................................................................................
    public boolean CREAR_USUARIO(USUARIO USU){
        PreparedStatement ps = null ;
        Connection con = getConexion () ;
        String Insertar_Usuario="INSERT INTO `userr`(`IDUSER`, `ID_Rol`, `USER`, `NAME`, `PASS`) VALUES (?,?,?,?,?)";
         
        try {
            ps=con.prepareStatement(Insertar_Usuario);
            ps.setString(1, USU.getIDUSERU());
            ps.setInt(2, USU.getID_RolU());
            ps.setString(3, USU.getUSERU());
            ps.setString(4, USU.getNAMEU());
            ps.setString(5, USU.getPASSU());
            ps.execute();
            return true;
            
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }finally{
            try {
                con.close();
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        
        
        
        
    }
    
    //ACTUALIZAR USUARIO......................................................................................
    public boolean UPDATE_USUARIO(USUARIO USU){
        PreparedStatement ps = null ;
        Connection con = getConexion () ;
        String Update_Usuario="UPDATE userr SET ID_Rol=?,USER=?,NAME=?,PASS=? WHERE IDUSER=?;";
         
        try {
            ps=con.prepareStatement(Update_Usuario);
            ps.setInt(1, USU.getID_RolU());
            ps.setString(2, USU.getUSERU());
            ps.setString(3, USU.getNAMEU());
            ps.setString(4, USU.getPASSU());
            ps.setString(5, USU.getIDUSERU());
            ps.execute();
            return true;
            
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }finally{
            try {
                con.close();
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        
        
        
        
    }
    
        //DELETE USUARIO......................................................................................

     public boolean DELETE_USUARIO(USUARIO USU){
        PreparedStatement ps = null ;
        Connection con = getConexion () ;
        String ELIMINAR_Usuario="DELETE FROM userr WHERE IDUSER=?;";
         
        try {
            ps=con.prepareStatement(ELIMINAR_Usuario);
            ps.setString(1, USU.getIDUSERU());
            ps.execute();
            return true;
            
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }finally{
            try {
                con.close();
            } catch (Exception e) {
                System.err.println(e);
            }
        }

}     ////-----------------------*****---------------------------CONSULTAS PRODUCTO-------------------------------*****------------------------

       //CREAR USUARIO......................................................................................
    public boolean CREAR_CATEGORIA(CATEGORIA CATG){
        PreparedStatement ps = null ;
        Connection con = getConexion () ;
        String Insertar_Categoria="INSERT INTO categoria( NAME, Descripcion_Ctg) VALUES (?,?);";
         
        try {
            ps=con.prepareStatement(Insertar_Categoria);
            ps.setString(1, CATG.getNAMEC());
            ps.setString(2, CATG.getDescripcion_CtgC());
            ps.execute();
            return true;
            
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }finally{
            try {
                con.close();
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }
        
         //Listar Categoria......................................................................................
    public ArrayList Listar_CATEGORIA(){
        ArrayList ArrayCategoria=new ArrayList();
        
        PreparedStatement ps = null ;
        Connection con = getConexion () ;
         
        try {
            String Listar_Categoria="SELECT * FROM categoria;";
            ps=con.prepareStatement(Listar_Categoria);
            ResultSet rs;
            rs=ps.executeQuery();
            while (rs.next()) {                
              CATEGORIA CATG=new CATEGORIA();
              CATG.setIDCATEGORIAC(rs.getString("IDCATEGORIA"));
              CATG.setNAMEC(rs.getString("NAME"));
              CATG.setDescripcion_CtgC(rs.getString("Descripcion_Ctg"));
              ArrayCategoria.add(CATG);
              
            }
            
        } catch (SQLException e) {  
            System.err.println(e);
             
        }finally{
            try {
                con.close();
            } catch (Exception e) {
                System.err.println(e);
            }
        }
       
        return ArrayCategoria;
    }
    //GUARADR PRODUCTO......................................................................................
    public boolean CREAR_PRODUCTO(PRODUCTO PRO, FileInputStream fis,int logitud){
        PreparedStatement ps = null ;
        Connection con = getConexion () ;
        String Insertar_Categoria="INSERT INTO `producto`( `CODIGO`, `IDCATEGORIA`, `NAMEPROD`, `PRECIO`, `STOCK`, `IMG`) VALUES (?,?,?,?,?,?);";
         
        try {
            ps=con.prepareStatement(Insertar_Categoria);
             ps.setString(1, PRO.getIDPRODUCTOP());
             ps.setString(2, PRO.getIDCATEGORIAP());
             ps.setString(3, PRO.getNAMEPRODP());
             ps.setString(4, PRO.getPRECIOP());
             ps.setString(5, PRO.getSTOCKP());
             ps.setBlob(6, fis, logitud);
             
            ps.execute();
            return true;
            
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }finally{
            try {
                con.close();
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }
    //MOSTRAR IMG......................................................................................
    public PRODUCTO MOSTRAR_IMG(PRODUCTO PRO){
        PreparedStatement ps = null ;
        Connection con = getConexion () ;
        String Insertar_Categoria="SELECT  `IMG` FROM `producto`WHERE CODIGO=?; ";
         
        try {
            ps=con.prepareStatement(Insertar_Categoria);
             ps.setString(1, PRO.getIDPRODUCTOP());
            ps.execute();
            ResultSet rs;
            rs=ps.executeQuery();
            while (rs.next()){                
             //PRODUCTO PROD=new PRODUCTO();
              PRO.setRLP(rs.getBlob("IMG"));
            }
            
        } catch (SQLException e) {
            System.err.println(e);
             
        }finally{
            try {
                con.close();
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        return PRO;
    }
    
    //EDITAR PRODUCTO......................................................................................
    public boolean UPDATE_PRODUCTO(PRODUCTO PRO, FileInputStream fis,int logitud){
        PreparedStatement ps = null ;
        Connection con = getConexion () ;
        String UPDATEPROD="UPDATE `producto` SET IDCATEGORIA=?,NAMEPROD=?,PRECIO=?,STOCK=?,IMG=? WHERE CODIGO=?;";
         
        try {
            ps=con.prepareStatement(UPDATEPROD);
             ps.setString(1, PRO.getIDCATEGORIAP());
             ps.setString(2, PRO.getNAMEPRODP());
             ps.setString(3, PRO.getPRECIOP());
             ps.setString(4, PRO.getSTOCKP());
             ps.setBlob(5, fis,logitud) ;
             ps.setString(6, PRO.getIDPRODUCTOP());
             
            ps.execute();
            return true;
            
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }finally{
            try {
                con.close();
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }
    
        //DELETE PRODUCTO......................................................................................

     public boolean DELETE_PRODUCTO(PRODUCTO PRO){
        PreparedStatement ps = null ;
        Connection con = getConexion () ;
        String ELIMINAR_Usuario="DELETE FROM `producto` WHERE CODIGO=?;";
         
        try {
            ps=con.prepareStatement(ELIMINAR_Usuario);
            ps.setString(1, PRO.getIDPRODUCTOP());
            ps.execute();
            return true;
            
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }finally{
            try {
                con.close();
            } catch (Exception e) {
                System.err.println(e);
            }
        }

}
     public boolean ACTUALIZARSTOCK_PRODUCTO(PRODUCTO PRO){
        PreparedStatement ps = null ;
        Connection con = getConexion () ;
        String UPDATESTOCK="UPDATE producto SET STOCK=? WHERE CODIGO=?;";
         
        try {
            ps=con.prepareStatement(UPDATESTOCK);
            ps.setString(1, PRO.getSTOCKP());
            ps.setString(2, PRO.getIDPRODUCTOP());
            ps.execute();
            return true;
            
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }finally{
            try {
                con.close();
            } catch (Exception e) {
                System.err.println(e);
            }
        }

}
     
     
}