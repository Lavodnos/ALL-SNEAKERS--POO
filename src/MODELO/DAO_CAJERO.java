 
package MODELO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author kimbe
 */
public class DAO_CAJERO extends CONEXION{
    public  static  int idserialRegistrado;
    java.math.BigDecimal iDSERIALVAR;
    
    //REGISTRAR VENTA......................................................................................
    
    ///crear serial de boleta
    public boolean CREAR_SERIAL(SERIAL SER){
        PreparedStatement ps = null ;
        Connection con = getConexion () ;
        String Insertar_SERIAL="INSERT INTO `seriall`( `IDCLIENTE`, `IDUSER`, `FECHA`) VALUES (?,?,?);";
          Date fechaactual=new Date();
         SimpleDateFormat fechax=new SimpleDateFormat("YYYY-MM-dd");    
          String Fecha=fechax.format(fechaactual);
        try {
            ps=con.prepareStatement(Insertar_SERIAL,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, SER.getIDCLIENTES());
            ps.setString(2, SER.getIDUSERS());
            ps.setString(3, Fecha);
            ps.execute();
            
           ResultSet rs= ps.getGeneratedKeys();
           while(rs.next()){
               iDSERIALVAR=rs.getBigDecimal(1);
               idserialRegistrado=iDSERIALVAR.intValue();
           }
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
    ///crear DETALLEVENTA de boleta
    public boolean CREAR_DETALLE_VENTA(DETALLE_VENTA DTV){
        PreparedStatement ps = null ;
        Connection con = getConexion () ;
        String Insertar_Usuario="INSERT INTO `datallev`( `IDPRODUCTO`, `IDSERIAL`, `CANTIDAD`, `SUBTOTAL`, `IGV`, `TOTAL`) \n" +
                                    "VALUES (?,?,?,?,?,?);";
  
        try {
            ps=con.prepareStatement(Insertar_Usuario);
            ps.setString(1, DTV.getIDPRODUCTOD());
            ps.setInt(2, idserialRegistrado);
            ps.setInt(3, DTV.getCANTIDADD());
            ps.setDouble(4, DTV.getSUBTOTALD());
            ps.setDouble(5, DTV.getIGVD());
            ps.setDouble(6, DTV.getTOTALD());
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
    //Listar PRODUCTOS......................................................................................
    public ArrayList Listar_PRODUCTO(){
        ArrayList ArrayPRODUCTO=new ArrayList();
        
        PreparedStatement ps = null ;
        Connection con = getConexion() ;
         
        try {
            String Listar_Producto="SELECT  `CODIGO`, `IDCATEGORIA`, `NAMEPROD`, `PRECIO`, `STOCK`, `IMG` FROM `producto`;";
            ps=con.prepareStatement(Listar_Producto);
            ResultSet rs;
            rs=ps.executeQuery();
            while (rs.next()) {                
              PRODUCTO PRO=new PRODUCTO();
              PRO.setIDPRODUCTOP(rs.getString("CODIGO"));
              PRO.setIDCATEGORIAP(rs.getString("IDCATEGORIA"));
              PRO.setNAMEPRODP(rs.getString("NAMEPROD"));
              PRO.setPRECIOP(rs.getString("PRECIO"));
              PRO.setSTOCKP(rs.getString("STOCK"));
              
              ArrayPRODUCTO.add(PRO);
              
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
       
        return ArrayPRODUCTO;
    }
    //Listar CLIENTES......................................................................................
    public ArrayList Listar_CLIENTE(){
        ArrayList ArrayCLIENTE=new ArrayList();
        
        PreparedStatement ps = null ;
        Connection con = getConexion() ;
         
        try {
            String Listar_CLIENTE="SELECT * FROM `cliente`;";
            ps=con.prepareStatement(Listar_CLIENTE);
            ResultSet rs;
            rs=ps.executeQuery();
            while (rs.next()) {                
              CLIENTE CLI=new CLIENTE();
              CLI.setDNICC(rs.getString("IDCLIENTE"));
              CLI.setDNICC(rs.getString("DNIC"));
              CLI.setNameC(rs.getString("Name"));
              
              ArrayCLIENTE.add(CLI);
              
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
       
        return ArrayCLIENTE;
    }
    
    //CREAR CLIENTE......................................................................................
    public boolean CREAR_CLIENTE(CLIENTE CLI){
        PreparedStatement ps = null ;
        Connection con = getConexion () ;
        String Insertar_Usuario="INSERT INTO `cliente`( `DNIC`, `Name`) VALUES (?,?);";
         
        try {
            ps=con.prepareStatement(Insertar_Usuario);
            ps.setString(1, CLI.getDNICC());
            ps.setString(2, CLI.getNameC());
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
    //BUSQUEDA CLIENTE......................................................................................
    public CLIENTE BUSQUEDA_CLIENTE(CLIENTE CLI){
        PreparedStatement ps = null ;
        Connection con = getConexion () ;
        String Insertar_Usuario="SELECT IDCLIENTE, `DNIC`, Name FROM `cliente` WHERE DNIC=?;";
         
        try {
            ps=con.prepareStatement(Insertar_Usuario);
            ps.setString(1, CLI.getDNICC());
            ps.execute();
            ResultSet rs;
            rs=ps.executeQuery();
            while (rs.next()) {           
              CLI.setIDCLIENTEC(rs.getString("IDCLIENTE"));  
              CLI.setDNICC(rs.getString("DNIC"));
               CLI.setNameC(rs.getString("Name"));
                
              
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
        
        
        
        return CLI;
    }
     //BUSQUEDA  PRODUCTO......................................................................................
        public PRODUCTO BUSQUEDAPRODU(PRODUCTO PRO){
                Connection con = getConexion () ;
                PreparedStatement ps = null ;
                ResultSet rs=null;

                String sqlValidarr="SELECT `IDPRODUCTO`,  `NAMEPROD`, `PRECIO`, `STOCK`  FROM `producto` WHERE NAMEPROD=?;";

                try {

                                ps=con.prepareStatement(sqlValidarr);
                                ps.setString(1, PRO.getNAMEPRODP());
                              
                                 rs=ps.executeQuery();
                if (rs.next()) {

                PRO.setIDPRODUCTOP(rs.getString("IDPRODUCTO"));
                PRO.setNAMEPRODP(rs.getString("NAMEPROD"));
                PRO.setPRECIOP(rs.getString("PRECIO"));
                PRO.setSTOCKP(rs.getString("STOCK"));
                ///CALCULAR IGV
               
             double igv = Math.round((Double.parseDouble(rs.getString("PRECIO"))*0.18)*100.0)/100.0;
                String igvS=igv+"";
                PRO.setIDCATEGORIAP(igvS);     
    
    }
    } catch (Exception e) {
     
    }
    return PRO;
    }
        
        
        //Listar DATOS PARA PDF......................................................................................
    public ArrayList LISTARDATOSVENTA(){
        ArrayList<MODELOPDF> ArrayCLIENTE=new ArrayList();
        
        PreparedStatement ps = null ;
        Connection con = getConexion() ;
         
        try {
            String Listar_CLIENTE="SELECT  C.Name AS CLIENTE,U.NAME AS CAJERO, P.NAMEPROD AS PRODUCTO , D.CANTIDAD, D.SUBTOTAL,D.IGV, D.TOTAL, S.FECHA\n" +
"FROM datallev D  \n" +
"INNER JOIN producto P ON P.IDPRODUCTO=D.IDPRODUCTO\n" +
"INNER JOIN seriall S ON S.IDSERIAL=D.IDSERIAL\n" +
"INNER JOIN cliente C ON C.IDCLIENTE=S.IDCLIENTE\n" +
"INNER JOIN userr U ON U.IDUSER=S.IDUSER\n" +
"WHERE D.IDSERIAL="+idserialRegistrado+";";
            ps=con.prepareStatement(Listar_CLIENTE);
            ResultSet rs;
            rs=ps.executeQuery();
            while (rs.next()) {                
              MODELOPDF PDF=new MODELOPDF();
              PDF.setCLIENTEE(rs.getString("CLIENTE"));
              PDF.setCAJEROO(rs.getString("CAJERO"));
              PDF.setPRODUCTOO(rs.getString("PRODUCTO"));
              PDF.setCANTIDADD(rs.getString("CANTIDAD"));
              PDF.setSUBTOTALL(rs.getString("SUBTOTAL"));
              PDF.setIGVV(rs.getString("IGV"));
              PDF.setTOTALL(rs.getString("TOTAL"));
              PDF.setFECHAA(rs.getString("FECHA"));
              
              ArrayCLIENTE.add(PDF);
              
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
       
        return ArrayCLIENTE;
    }
        
}
