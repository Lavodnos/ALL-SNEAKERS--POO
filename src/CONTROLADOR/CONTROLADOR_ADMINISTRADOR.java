 
package CONTROLADOR;
import MODELO.CATEGORIA;
import MODELO.CONEXION;
import MODELO.DAO_ADMINISTRADOR;
import MODELO.PRODUCTO;
import MODELO.USUARIO;
import Main_CRUD.Hash;
import VISTA.ADMINISTRADOR.B_INVENTARIO;
import VISTA.ADMINISTRADOR.B_STOCK_INVENTARIO;
import VISTA.ADMINISTRADOR.C_Reporte_Admin;
import VISTA.ADMINISTRADOR.Producto_C_Admin;
import VISTA.ADMINISTRADOR.Producto_Categoria;
import VISTA.ADMINISTRADOR.Producto_R_Admin;
import VISTA.ADMINISTRADOR.Usuario_C_Admin;
import VISTA.ADMINISTRADOR.Usuario_R_Admin;
import VISTA.CONTROL_ACCESO.Login;
import VISTA.PROVEDOR.B_INVENTARIO_P;
import VISTA.PROVEDOR.B_STOCK_INVENTARIO_P;
import VISTA.PROVEDOR.C_Reporte_Admin_P;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DanielSan
 */
//implementamos la gestion de eventos

public class CONTROLADOR_ADMINISTRADOR implements ActionListener{
 
    ///declaromos las variables DEL FORMULARIOS QUE EXISTEN
    Usuario_R_Admin FLEERUSU;
    Login Login;
    Usuario_C_Admin FCREARUSU;
    Producto_Categoria FCATEGORIA;
    Producto_C_Admin FCREARPRODUCT;
    Producto_R_Admin FLEERPRODUCT;
    B_STOCK_INVENTARIO FBINVENTARIO;
    B_INVENTARIO FINVENTARIO;
    C_Reporte_Admin FREPORTES;
    ///--------------------
    B_INVENTARIO_P FINVENTARIOP;
    B_STOCK_INVENTARIO_P FBINVENTARIOP;
    C_Reporte_Admin_P FREPORTESP;
    //CAJERO_VJF FCAJERO;
    
    
    //'..........CONSTRUCTOR
    public CONTROLADOR_ADMINISTRADOR(){
        this.Login=new Login();
        this.FLEERUSU=new Usuario_R_Admin();
        this.FCREARUSU=new Usuario_C_Admin();
        this.FCATEGORIA=new Producto_Categoria();
        this.FCREARPRODUCT=new Producto_C_Admin();
        this.FLEERPRODUCT=new Producto_R_Admin();
        this.FBINVENTARIO=new B_STOCK_INVENTARIO();
        this.FINVENTARIO=new B_INVENTARIO();
        this.FREPORTES=new C_Reporte_Admin();
        //-----
        this.FINVENTARIOP=new B_INVENTARIO_P();
        this.FBINVENTARIOP=new B_STOCK_INVENTARIO_P();
        this.FREPORTESP=new C_Reporte_Admin_P();
        
    }
    //---------- METODOS DE INICIO...........................................
         public void IniciarLogin(){
            Login.btnEntrar.addActionListener(this);
            Login.setLocationRelativeTo(null);
            Login.setVisible(true);
        }
         public void IniciarFREPORTE(){
             //==botones menu
                        FREPORTES.btnInventario.addActionListener(this);
                        FREPORTES.btnReportes.addActionListener(this);
                        FREPORTES.btnProductos.addActionListener(this);
                        FREPORTES.btnUsuarios.addActionListener(this);
                        FREPORTES.btnCategoria.addActionListener(this);
                        FREPORTES.btnStock.addActionListener(this);
                        
            //----
            //FREPORTES.btnEntrar.addActionListener(this);
            FREPORTES.btnMOSTRARV.addActionListener(this);
             FREPORTES.setLocationRelativeTo(null);
            FREPORTES.setVisible(true);
        }
         public void IniciarFREPORTEP(){
             //==botones menu
                        FREPORTESP.btnInventario.addActionListener(this);
                        FREPORTESP.btnstock.addActionListener(this);
                        FREPORTESP.btnreporte.addActionListener(this);
                      
                        
            //----
            //FREPORTES.btnEntrar.addActionListener(this);
            FREPORTESP.btnMOSTRARV.addActionListener(this);
             FREPORTESP.setLocationRelativeTo(null);
            FREPORTESP.setVisible(true);
        }
        public void IniciarFLEERUSU(){
            //==botones menu
                        FLEERUSU.btnInventario.addActionListener(this);
                        FLEERUSU.btnReportes.addActionListener(this);
                        FLEERUSU.btnProductos.addActionListener(this);
                        FLEERUSU.btnUsuarios.addActionListener(this);
                        FLEERUSU.btnCategoria.addActionListener(this);
                        FLEERUSU.btnStock.addActionListener(this);
            //----
            FLEERUSU.btnMostrar.addActionListener(this);
            FLEERUSU.btnCREARUSUARIO.addActionListener(this);
            FLEERUSU.btnEDITARUSAURIO.addActionListener(this);
            FLEERUSU.btnELIMINARUSUARIO1.addActionListener(this);
            FLEERUSU.setLocationRelativeTo(null);
            FLEERUSU.setVisible(true);
        }
         public void IniciarFCREARUSU(){
              //==botones menu
                        FCREARUSU.btnInventario.addActionListener(this);
                        FCREARUSU.btnReportes.addActionListener(this);
                        FCREARUSU.btnProductos.addActionListener(this);
                        FCREARUSU.btnUsuarios.addActionListener(this);
                        FCREARUSU.btnCategoria.addActionListener(this);
                        FCREARUSU.btnStock.addActionListener(this);
            //----
            FCREARUSU.btnCREARUSUARIO.addActionListener(this);
            FCREARUSU.setLocationRelativeTo(null);
            FCREARUSU.setVisible(true);
        }
          public void IniciarFCATEGORIA(){
              //==botones menu
                        FCATEGORIA.btnInventario.addActionListener(this);
                        FCATEGORIA.btnReportes.addActionListener(this);
                        FCATEGORIA.btnProductos.addActionListener(this);
                        FCATEGORIA.btnUsuarios.addActionListener(this);
                        FCATEGORIA.btnCategoria.addActionListener(this);
                        FCATEGORIA.btnStock.addActionListener(this);
            //----
            FCATEGORIA.btnCrearCategoria.addActionListener(this);
            FCATEGORIA.setLocationRelativeTo(null);
            FCATEGORIA.setVisible(true);
        }
          public void IniciarFCREARPRODUCT(){
               //==botones menu
                        FCREARPRODUCT.btnInventario.addActionListener(this);
                        FCREARPRODUCT.btnReportes.addActionListener(this);
                        FCREARPRODUCT.btnProductos.addActionListener(this);
                        FCREARPRODUCT.btnUsuarios.addActionListener(this);
                        FCREARPRODUCT.btnCategoria.addActionListener(this);
                        FCREARPRODUCT.btnStock.addActionListener(this);
            //----
            FCREARPRODUCT.btnGuardarIMG.addActionListener(this);
            FCREARPRODUCT.btnCREARPRDUCTO1.addActionListener(this);
            FCREARPRODUCT.setLocationRelativeTo(null);
            FCREARPRODUCT.setVisible(true);
             ListarCategorias();
        }
          public void IniciarFLEERPRODUCTO(){
             //==botones menu
                        FLEERPRODUCT.btnInventario.addActionListener(this);
                        FLEERPRODUCT.btnReportes.addActionListener(this);
                        FLEERPRODUCT.btnProductos.addActionListener(this);
                        FLEERPRODUCT.btnUsuarios.addActionListener(this);
                        FLEERPRODUCT.btnCategoria.addActionListener(this);
                        FLEERPRODUCT.btnStock.addActionListener(this);
            //----
            FLEERPRODUCT.btnCREARPRODUCTO.addActionListener(this);
             FLEERPRODUCT.btnGuardarIMG.addActionListener(this);
            FLEERPRODUCT.btnMostrar.addActionListener(this);
            FLEERPRODUCT.btnEDITARPRODUCTO.addActionListener(this);
            FLEERPRODUCT.btnElimnarP.addActionListener(this);
              ListarCategoriasLEEP();
            FLEERPRODUCT.setLocationRelativeTo(null);
            FLEERPRODUCT.setVisible(true);
            
           
        }
                public void IniciarFBINVENTARIO(){
             //==botones menu
                        FBINVENTARIO.btnInventario.addActionListener(this);
                        FBINVENTARIO.btnReportes.addActionListener(this);
                        FBINVENTARIO.btnProductos.addActionListener(this);
                        FBINVENTARIO.btnUsuarios.addActionListener(this);
                        FBINVENTARIO.btnCategoria.addActionListener(this);
                        FBINVENTARIO.btnStock.addActionListener(this);
            //----
            
            FBINVENTARIO.btnListar.addActionListener(this);
            FBINVENTARIO.btnasignar.addActionListener(this);
              ListarCategoriasLEEP();
            FBINVENTARIO.setLocationRelativeTo(null);
            FBINVENTARIO.setVisible(true);
            
           
        }
                 public void IniciarFBINVENTARIOP(){
             //==botones menu
                        FBINVENTARIOP.btnInventario.addActionListener(this);
                        FBINVENTARIOP.btnstock.addActionListener(this);
                        FBINVENTARIOP.btnreporte.addActionListener(this);
                         
            //----
            
            FBINVENTARIOP.btnListar.addActionListener(this);
            FBINVENTARIOP.btnasignar.addActionListener(this);
              ListarCategoriasLEEP();
            FBINVENTARIOP.setLocationRelativeTo(null);
            FBINVENTARIOP.setVisible(true);
            
           
        }
                
                public void IniciarFINVENTARIO() throws SQLException{
                    ListarProductoFINVENTARIOG();
                    LimpiarFINVENTARIO();
              //==botones menu
                        FINVENTARIO.btnInventario.addActionListener(this);
                        FINVENTARIO.btnReportes.addActionListener(this);
                        FINVENTARIO.btnProductos.addActionListener(this);
                        FINVENTARIO.btnUsuarios.addActionListener(this);
                        FINVENTARIO.btnCategoria.addActionListener(this);
                        FINVENTARIO.btnStock.addActionListener(this);
            //----
            
            FINVENTARIO.btnActualizar.addActionListener(this);
            FINVENTARIO.btnFILTRARNOMBRE1.addActionListener(this);
            FINVENTARIO.btnFILTRARCodigo.addActionListener(this);
              
            FINVENTARIO.setLocationRelativeTo(null);
            FINVENTARIO.setVisible(true);
            
           
        }

            public void IniciarFINVENTARIOP() throws SQLException{
                    ListarProductoFINVENTARIOGPP();
                    LimpiarFINVENTARIOP();
              //==botones menu
                        FINVENTARIOP.btnInventario.addActionListener(this);
                        FINVENTARIOP.btnstock.addActionListener(this);
                        FINVENTARIOP.btnreporte.addActionListener(this);
                         
            //----
            
            FINVENTARIOP.btnActualizar.addActionListener(this);
            FINVENTARIOP.btnFILTRARNOMBRE1.addActionListener(this);
            FINVENTARIOP.btnFILTRARCodigo.addActionListener(this);
              
            FINVENTARIOP.setLocationRelativeTo(null);
            FINVENTARIOP.setVisible(true);
            
           
        } 
          
        
       
        
//..........................................................................
        
//---------------------------------------------------------CONDICION DE BOTONES.............................
         
         
         
         
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(FLEERUSU.btnMostrar)) {//----------------------------------------------------1
            try {
           MostrarUusuarios();
            
            FLEERUSU.jtableMOSTRARUSUARIO.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent Mouse_Evt){
                    JTable table=(JTable) Mouse_Evt.getSource();
                    Point point=Mouse_Evt.getPoint();
                    int row=table.rowAtPoint(point);
                    if (Mouse_Evt.getClickCount()==1) {
                        
                        ///capturar datos
                      int n=0;
                         
                        if (FLEERUSU.jtableMOSTRARUSUARIO.getValueAt(FLEERUSU.jtableMOSTRARUSUARIO.getSelectedRow(), 2).toString()=="ADMINISTRADOR") {
                             n=1;
                        }if (FLEERUSU.jtableMOSTRARUSUARIO.getValueAt(FLEERUSU.jtableMOSTRARUSUARIO.getSelectedRow(), 2).toString()=="PROVEDOR") {
                              n=2;
                        }if (FLEERUSU.jtableMOSTRARUSUARIO.getValueAt(FLEERUSU.jtableMOSTRARUSUARIO.getSelectedRow(), 2).toString()=="CAJERO") {
                              n=3;
                        }
                     FLEERUSU.txtID.setText(FLEERUSU.jtableMOSTRARUSUARIO.getValueAt(FLEERUSU.jtableMOSTRARUSUARIO.getSelectedRow(), 0).toString());
                     FLEERUSU.txtName.setText(FLEERUSU.jtableMOSTRARUSUARIO.getValueAt(FLEERUSU.jtableMOSTRARUSUARIO.getSelectedRow(), 1).toString());
                     FLEERUSU.cboIdCargo.setSelectedIndex(n);
                     FLEERUSU.txtuser.setText(FLEERUSU.jtableMOSTRARUSUARIO.getValueAt(FLEERUSU.jtableMOSTRARUSUARIO.getSelectedRow(), 3).toString());
     
                      
                                                  
                    }
                    
                }
               
        
        });
        } catch (Exception ex) {
            System.err.println(ex.toString());
        }
            
        }if (e.getSource().equals(FLEERUSU.btnEDITARUSAURIO)) {//----------------------------------------------------2
            USUARIO mod=new USUARIO();
            ///captura datos
             mod.setIDUSERU(FLEERUSU.txtID.getText());
            mod.setNAMEU(FLEERUSU.txtName.getText());           
            mod.setID_RolU(FLEERUSU.cboIdCargo.getSelectedIndex());
            mod.setUSERU(FLEERUSU.txtuser.getText()); 
            ///vamos a encriptar contraseña
            String  pass=new String(FLEERUSU.txtpass.getText());
            String nuevopass=Hash.md5(pass);
            mod.setPASSU(nuevopass);
            ///llamar al metodo DAO
            DAO_ADMINISTRADOR modc=new DAO_ADMINISTRADOR();
             if (modc.UPDATE_USUARIO(mod)) { ///si esto es true
                    JOptionPane.showMessageDialog(null, "REGISTRO ACTUALIZADO");
                    Limpiar();
            }else{
                    JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR");
                     Limpiar();
                }
        }
        if (e.getSource().equals(FLEERUSU.btnELIMINARUSUARIO1)) {//----------------------------------------------------3
            ///captura datos
              USUARIO mod=new USUARIO();
             mod.setIDUSERU(FLEERUSU.txtID.getText());
             ///llamar al metodo DAO
            DAO_ADMINISTRADOR modc=new DAO_ADMINISTRADOR();
             if (modc.DELETE_USUARIO(mod)) { ///si esto es true
                    JOptionPane.showMessageDialog(null, "REGISTRO ELIMINADO");
                    Limpiar();
            }else{
                    JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR");
                     Limpiar();
                }
        }if (e.getSource().equals(Login.btnEntrar)) {//-----------------------------------------------------------------4
            ///capturan datos del login
            USUARIO mod=new USUARIO();
             mod.setUSERU(Login.txtID.getText());
              ///vamos a desencriptar la contraseña
            String  pass=new String(Login.Password.getPassword());
            String nuevopass=Hash.md5(pass);

            mod.setPASSU(nuevopass);
            ////-------------------
              
           DAO_ADMINISTRADOR modc=new DAO_ADMINISTRADOR();
           modc.Validar(mod); 
           if (mod.getID_RolU()!=0) {
            
        
            int rol= mod.getID_RolU();
            String IDUSER=mod.getIDUSERU();
            String user=mod.getUSERU();
            String name=mod.getNAMEU();
               if (rol==1) {
                    JOptionPane. showMessageDialog(null, "BIENVENIDO ADMINISTRADOR");
                     this.Login.dispose();
                        CONTROLADOR_ADMINISTRADOR ctrl=new CONTROLADOR_ADMINISTRADOR();
            try {
                ctrl.IniciarFINVENTARIO();
            } catch (SQLException ex) {
                Logger.getLogger(CONTROLADOR_ADMINISTRADOR.class.getName()).log(Level.SEVERE, null, ex);
            }
               }if (rol==2) {
                                       JOptionPane. showMessageDialog(null, "BIENVENIDO PROVEDOR");
  CONTROLADOR_ADMINISTRADOR ctrl=new CONTROLADOR_ADMINISTRADOR();
  ctrl.IniciarFBINVENTARIOP();
    
               }if (rol==3) {
                                       JOptionPane. showMessageDialog(null, "BIENVENIDO CAJERO");
                      CONTROLADOR_CAJERO cont=new CONTROLADOR_CAJERO();
                     // JOptionPane.showMessageDialog(null, IDUSER);
                                cont.IniciarCaja(Integer.parseInt(IDUSER),user,name);
                                Login.dispose();
               }
        }else{
                           JOptionPane. showMessageDialog(null, "error de inicio");

           }

        }if (e.getSource().equals(FCREARUSU.btnCREARUSUARIO)) {//-----------------------------------------------------------------5
             USUARIO mod=new USUARIO();
             DAO_ADMINISTRADOR modc=new DAO_ADMINISTRADOR();


             mod.setIDUSERU(FCREARUSU.txtDNIUSUARIO.getText());
             mod.setNAMEU(FCREARUSU.txtNOMBREAPELLIDOUSU.getText());          
             mod.setID_RolU(FCREARUSU.CBOCARGOUSUA.getSelectedIndex());
             mod.setUSERU(FCREARUSU.txtCORREOUSU.getText()); 
            ///vamos a encriptar contraseña
            String  pass=new String(FCREARUSU.txtContraseUSU.getPassword());
            String nuevopass=Hash.md5(pass);

            mod.setPASSU(nuevopass);
            ////-------------------
            
                if (modc.CREAR_USUARIO(mod)) {
                    JOptionPane.showMessageDialog(null, "REGISTRO GUARDADO");
                    Limpiar();
            }else{
                    JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR");
                     Limpiar();
                }
                ///botones para mostrar formulario usuario
        }if (e.getSource().equals(FLEERUSU.btnCREARUSUARIO)) {// --------------------------------------------------------------7
             
            this.FLEERUSU.dispose();
            CONTROLADOR_ADMINISTRADOR ctrl=new CONTROLADOR_ADMINISTRADOR();
                    ctrl.IniciarFCREARUSU();
        }if (e.getSource().equals(FCATEGORIA.btnCrearCategoria)) {// --------------------------------------------------------------8
            CATEGORIA CATG=new CATEGORIA();
            ///captura datos
             CATG.setNAMEC(FCATEGORIA.txtnameCategoria.getText());
            CATG.setDescripcion_CtgC(FCATEGORIA.txtDescriocion.getText());            
            DAO_ADMINISTRADOR DAO_ADMIN=new DAO_ADMINISTRADOR();
             if (DAO_ADMIN.CREAR_CATEGORIA(CATG)) { ///si esto es true
                    JOptionPane.showMessageDialog(null, "REGISTRO GUARDADO");
                    LimpiarCATEGORIA();
            }else{
                    JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR");
                     LimpiarCATEGORIA();
                }
        }if (e.getSource().equals(FLEERPRODUCT.btnCREARPRODUCTO)) {// --------------------------------------------------------------9
            CONTROLADOR_ADMINISTRADOR ctrl=new CONTROLADOR_ADMINISTRADOR();
            this.FLEERPRODUCT.dispose();
            ctrl.IniciarFCREARPRODUCT();
           
        }if (e.getSource().equals(FCREARPRODUCT.btnCREARPRDUCTO1)) {// --------------------------------------------------------------10
            FileInputStream fis=null;
                int longitudBytes=0;
                JFileChooser se=new JFileChooser();
                se.setFileSelectionMode(JFileChooser.FILES_ONLY);
                int estado=se.showOpenDialog(null);
                if (estado==JFileChooser.APPROVE_OPTION) {
                    try {
                        fis=new FileInputStream(se.getSelectedFile());
                        longitudBytes=(int) se.getSelectedFile().length();
                        Image icono=ImageIO.read(se.getSelectedFile()).getScaledInstance(FCREARPRODUCT.btnGuardarIMG.getWidth(), FCREARPRODUCT.btnGuardarIMG.getHeight(), Image.SCALE_DEFAULT);
                        FCREARPRODUCT.btnGuardarIMG.setIcon(new ImageIcon(icono));
                        FCREARPRODUCT.btnGuardarIMG.updateUI();
                                     //JOptionPane.showMessageDialog(null, fis+""+longitudBytes);
                                     

                    } catch (Exception e2) {
                        JOptionPane.showMessageDialog(null, "ERROR AL CARGAR IMAGEN");
                    }
                }
                PRODUCTO PRO=new PRODUCTO();
                DAO_ADMINISTRADOR DAOADMIN=new DAO_ADMINISTRADOR();
                String idCa=FCREARPRODUCT.cboCategoria.getSelectedItem().toString()+"";
                PRO.setIDCATEGORIAP(idCa.substring(0, 2));
                String Codigo=idCa.substring(0, 2)+FCREARPRODUCT.txtNOMBREP.getText().substring(0, 4)+FCREARPRODUCT.txtPrecio.getText().substring(0, 2)+FCREARPRODUCT.txtNOMBREP.getText().substring(6, 10);
                PRO.setIDPRODUCTOP(Codigo);
                PRO.setNAMEPRODP(FCREARPRODUCT.txtNOMBREP.getText());
                PRO.setPRECIOP(FCREARPRODUCT.txtPrecio.getText());
                PRO.setSTOCKP(FCREARPRODUCT.txtstock.getText());
                 
               // DAOADMIN.CREAR_PRODUCTO(PRO,fis,longitudBytes);
                if (DAOADMIN.CREAR_PRODUCTO(PRO,fis,longitudBytes)==true) {
                    LimpiarFCREARPROD();
            JOptionPane.showMessageDialog(null, "PRODUCTO CREADO");
        }else{
                   JOptionPane.showMessageDialog(null, "ERROR AL REGISTRAR");

                }
                }if (e.getSource().equals(FLEERPRODUCT.btnMostrar)) {// --------------------------------------------------------------11
            try {
                ListarProducto();
                            FLEERPRODUCT.jtableProducto.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent Mouse_Evt){
                    JTable table=(JTable) Mouse_Evt.getSource();
                    Point point=Mouse_Evt.getPoint();
                    int row=table.rowAtPoint(point);
                    if (Mouse_Evt.getClickCount()==1) {
                        
                        ///capturar datos
                         
                     FLEERPRODUCT.txtcodigo.setText(FLEERPRODUCT.jtableProducto.getValueAt(FLEERPRODUCT.jtableProducto.getSelectedRow(), 0).toString());
                     FLEERPRODUCT.txtname.setText(FLEERPRODUCT.jtableProducto.getValueAt(FLEERPRODUCT.jtableProducto.getSelectedRow(), 1).toString());
                     FLEERPRODUCT.cbocategoria.setSelectedIndex(n()); 
                     FLEERPRODUCT.txtprecion.setText(FLEERPRODUCT.jtableProducto.getValueAt(FLEERPRODUCT.jtableProducto.getSelectedRow(), 3).toString());
                     FLEERPRODUCT.txtstock.setText(FLEERPRODUCT.jtableProducto.getValueAt(FLEERPRODUCT.jtableProducto.getSelectedRow(), 4).toString());
                     FLEERPRODUCT.txtcodigo.setText(FLEERPRODUCT.jtableProducto.getValueAt(FLEERPRODUCT.jtableProducto.getSelectedRow(), 0).toString());
                      
                   //  Blob blob= FLEERPRODUCT.jtableProducto.getValueAt(FLEERPRODUCT.jtableProducto.getSelectedRow(), 0).toString();
                      
                          try {
            PRODUCTO PRO=new PRODUCTO();
            DAO_ADMINISTRADOR DAOADMIN=new DAO_ADMINISTRADOR();
            PRO.setIDPRODUCTOP(FLEERPRODUCT.txtcodigo.getText());
            DAOADMIN.MOSTRAR_IMG(PRO);
            PRO.getRLP();
             Blob blob=PRO.getRLP();
             byte[] data=blob.getBytes(1, (int)blob.length());
             BufferedImage img=null;
             img=ImageIO.read(new ByteArrayInputStream(data));
             ImageIcon icono=new ImageIcon(img);
             Icon imagen=new ImageIcon(icono.getImage().getScaledInstance(FLEERPRODUCT.btnGuardarIMG.getWidth(), FLEERPRODUCT.btnGuardarIMG.getHeight(), Image.SCALE_DEFAULT));
             FLEERPRODUCT.btnGuardarIMG.setIcon(imagen); 
             
        } catch (Exception es) {
        }                         
                    }
                    
                }
               
        
        });
            } catch (SQLException ex) {
                Logger.getLogger(CONTROLADOR_ADMINISTRADOR.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }if (e.getSource().equals(FBINVENTARIO.btnListar)) {// --------------------------------------------------------------12
             
            try {
                ListarProductoFLISTAR();
                
                FBINVENTARIO.jtableProducto.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent Mouse_Evt){
                    JTable table=(JTable) Mouse_Evt.getSource();
                    Point point=Mouse_Evt.getPoint();
                    int row=table.rowAtPoint(point);
                    if (Mouse_Evt.getClickCount()==1) {
                        
                       
                     FBINVENTARIO.txtcodigo.setText(FBINVENTARIO.jtableProducto.getValueAt(FBINVENTARIO.jtableProducto.getSelectedRow(), 0).toString());
                     FBINVENTARIO.jspinStock.setValue((int)FBINVENTARIO.jtableProducto.getValueAt(FBINVENTARIO.jtableProducto.getSelectedRow(), 4));
                    
                      
                                                  
                    }
                    
                }
               
        
        });
                
            } catch (SQLException ex) {
                Logger.getLogger(CONTROLADOR_ADMINISTRADOR.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }if (e.getSource().equals(FBINVENTARIOP.btnListar)) {// --------------------------------------------------------------12
             
            try {
                ListarProductoFLISTARP();
                
                FBINVENTARIOP.jtableProducto.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent Mouse_Evt){
                    JTable table=(JTable) Mouse_Evt.getSource();
                    Point point=Mouse_Evt.getPoint();
                    int row=table.rowAtPoint(point);
                    if (Mouse_Evt.getClickCount()==1) {
                        
                       
                     FBINVENTARIOP.txtcodigo.setText(FBINVENTARIOP.jtableProducto.getValueAt(FBINVENTARIOP.jtableProducto.getSelectedRow(), 0).toString());
                     FBINVENTARIOP.jspinStock.setValue((int)FBINVENTARIOP.jtableProducto.getValueAt(FBINVENTARIOP.jtableProducto.getSelectedRow(), 4));
                    
                      
                                                  
                    }
                    
                }
               
        
        });
                
            } catch (SQLException ex) {
                Logger.getLogger(CONTROLADOR_ADMINISTRADOR.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }if ((e.getSource().equals(FLEERPRODUCT.btnEDITARPRODUCTO))) {// --------------------------------------------------------------13
///te pidira subir img
            FileInputStream fis=null;
                int longitudBytes=0;
                JFileChooser se=new JFileChooser();
                se.setFileSelectionMode(JFileChooser.FILES_ONLY);
                int estado=se.showOpenDialog(null);
                if (estado==JFileChooser.APPROVE_OPTION) {
                    try {
                        fis=new FileInputStream(se.getSelectedFile());
                        longitudBytes=(int) se.getSelectedFile().length();
                        Image icono=ImageIO.read(se.getSelectedFile()).getScaledInstance(FCREARPRODUCT.btnGuardarIMG.getWidth(), FCREARPRODUCT.btnGuardarIMG.getHeight(), Image.SCALE_DEFAULT);
                        FCREARPRODUCT.btnGuardarIMG.setIcon(new ImageIcon(icono));
                        FCREARPRODUCT.btnGuardarIMG.updateUI();
                                     //JOptionPane.showMessageDialog(null, fis+""+longitudBytes);
                                     

                    } catch (Exception e2) {
                        JOptionPane.showMessageDialog(null, "ERROR AL CARGAR IMAGEN");
                    }
                }
                
            
            DAO_ADMINISTRADOR DAOADMIN=new DAO_ADMINISTRADOR();
            String idCa=FLEERPRODUCT.cbocategoria.getSelectedItem().toString()+""; 
            PRODUCTO PRO=new PRODUCTO();
            PRO.setIDPRODUCTOP(FLEERPRODUCT.txtcodigo.getText());
            PRO.setIDCATEGORIAP(idCa.substring(0, 2));
            PRO.setNAMEPRODP(FLEERPRODUCT.txtname.getText());
            PRO.setPRECIOP(FLEERPRODUCT.txtprecion.getText());
            PRO.setSTOCKP(FLEERPRODUCT.txtstock.getText());
            //PRO.setRLP(FLEERPRODUCT.txtcodigo.getText());
           if (DAOADMIN.UPDATE_PRODUCTO(PRO,fis,longitudBytes)==true) {
                    LimpiarFLEERPR();
            JOptionPane.showMessageDialog(null, "PRODUCTO ACTUALIZADO");
        }else{
                   JOptionPane.showMessageDialog(null, "ERROR AL UPDATE");
                    LimpiarFLEERPR();
                }
        }if ((e.getSource().equals(FLEERPRODUCT.btnElimnarP))) {// --------------------------------------------------------------14
            PRODUCTO PRO=new PRODUCTO();
            PRO.setIDPRODUCTOP(FLEERPRODUCT.txtcodigo.getText());
            DAO_ADMINISTRADOR DAOADMIN=new DAO_ADMINISTRADOR();
            int RESP=JOptionPane.showConfirmDialog(null, "SEGURO QUE DESEAS ELIMNAR EL PRODUCTO?");
            ///JOptionPane.showMessageDialog(null, RESP);
              if (RESP==0) {
            DAOADMIN.DELETE_PRODUCTO(PRO);
            JOptionPane.showMessageDialog(null, "PRODUCTO ELIMINADO CORRECTAMENTE");
            } 
        }if ((e.getSource().equals(FBINVENTARIO.btnasignar))) {
            PRODUCTO PRO=new PRODUCTO();
            DAO_ADMINISTRADOR DAOADMIN=new DAO_ADMINISTRADOR();
            PRO.setSTOCKP(FBINVENTARIO.jspinStock.getValue().toString());
            PRO.setIDPRODUCTOP(FBINVENTARIO.txtcodigo.getText());
            
            if (DAOADMIN.ACTUALIZARSTOCK_PRODUCTO(PRO)==true) {
            JOptionPane.showMessageDialog(null, "STOCK ACTUALIZADO CORRECTAMENTE ");
        }else{
                 JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR");
            }
            
        }if ((e.getSource().equals(FBINVENTARIOP.btnasignar))) {
            PRODUCTO PRO=new PRODUCTO();
            DAO_ADMINISTRADOR DAOADMIN=new DAO_ADMINISTRADOR();
            PRO.setSTOCKP(FBINVENTARIOP.jspinStock.getValue().toString());
            PRO.setIDPRODUCTOP(FBINVENTARIOP.txtcodigo.getText());
            
            if (DAOADMIN.ACTUALIZARSTOCK_PRODUCTO(PRO)==true) {
            JOptionPane.showMessageDialog(null, "STOCK ACTUALIZADO CORRECTAMENTE ");
        }else{
                 JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR");
            }
            
        }if ((e.getSource().equals(FINVENTARIO.btnActualizar))) { 
            try {
                ListarProductoFINVENTARIOG();
            } catch (SQLException ex) {
                Logger.getLogger(CONTROLADOR_ADMINISTRADOR.class.getName()).log(Level.SEVERE, null, ex);
            }
                    LimpiarFINVENTARIO();
        }if ((e.getSource().equals(FINVENTARIOP.btnActualizar))) { 
            try {
                ListarProductoFINVENTARIOGPP();
            } catch (SQLException ex) {
                Logger.getLogger(CONTROLADOR_ADMINISTRADOR.class.getName()).log(Level.SEVERE, null, ex);
            }
                    LimpiarFINVENTARIOP();
        }if ((e.getSource().equals(FINVENTARIO.btnFILTRARNOMBRE1))) {// --------------------------------------------------------------16
            try { 
           
           
            ListarProductoFILTRO(FINVENTARIO.txtFName.getText(),"NAMEPROD");
         
            } catch (SQLException ex) {
                Logger.getLogger(CONTROLADOR_ADMINISTRADOR.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }if ((e.getSource().equals(FINVENTARIOP.btnFILTRARNOMBRE1))) {// --------------------------------------------------------------16
            try { 
           
           
            ListarProductoFILTRO(FINVENTARIOP.txtFName.getText(),"NAMEPROD");
         
            } catch (SQLException ex) {
                Logger.getLogger(CONTROLADOR_ADMINISTRADOR.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }if ((e.getSource().equals(FINVENTARIO.btnFILTRARCodigo))) {// -------------------------------------------------------------17
                try {
                
                   // JOptionPane.showMessageDialog(null, FINVENTARIO.txtFcodigo.getText());
               ListarProductoFILTRO(FINVENTARIO.txtFcodigo.getText(),"CODIGO");
            } catch (SQLException ex) {
                Logger.getLogger(CONTROLADOR_ADMINISTRADOR.class.getName()).log(Level.SEVERE, null, ex);
            }

        }if ((e.getSource().equals(FINVENTARIOP.btnFILTRARCodigo))) {// -------------------------------------------------------------17
                try {
                
                   // JOptionPane.showMessageDialog(null, FINVENTARIO.txtFcodigo.getText());
               ListarProductoFILTRO(FINVENTARIOP.txtFcodigo.getText(),"CODIGO");
            } catch (SQLException ex) {
                Logger.getLogger(CONTROLADOR_ADMINISTRADOR.class.getName()).log(Level.SEVERE, null, ex);
            }

        }       
        
        
 //*************************************+++++++++++++++++++++++++BOTONES DE********************************************************************************************************
 
//*****************************************++++++++++++++++++++++++MENU****************************************************************************************************
        
        // -- ------------abri usuarios
        if (e.getSource().equals(FLEERUSU.btnUsuarios)  || 
            e.getSource().equals(FCREARUSU.btnUsuarios) ||
            e.getSource().equals(FCATEGORIA.btnUsuarios) || 
            e.getSource().equals(FCREARPRODUCT.btnUsuarios) || 
            e.getSource().equals(FLEERPRODUCT.btnUsuarios) || 
            e.getSource().equals(FBINVENTARIO.btnUsuarios) ||
            e.getSource().equals(FINVENTARIO.btnUsuarios) || 
            e.getSource().equals(FREPORTES.btnUsuarios)) {
            this.FLEERUSU.dispose();
            this.FCREARUSU.dispose();
            this.FCATEGORIA.dispose();
            this.FCREARPRODUCT.dispose();
            this.FLEERPRODUCT.dispose();
            this.FBINVENTARIO.dispose();
            this.FINVENTARIO.dispose();
            this.FREPORTES.dispose();
            CONTROLADOR_ADMINISTRADOR ctrl=new CONTROLADOR_ADMINISTRADOR();
                    ctrl.IniciarFLEERUSU();
        }// -- ------------abri inventario
        if (e.getSource().equals(FLEERUSU.btnInventario)  || 
            e.getSource().equals(FCREARUSU.btnInventario) ||
            e.getSource().equals(FCATEGORIA.btnInventario) || 
            e.getSource().equals(FCREARPRODUCT.btnInventario) || 
            e.getSource().equals(FLEERPRODUCT.btnInventario) || 
            e.getSource().equals(FBINVENTARIO.btnInventario) ||
            e.getSource().equals(FINVENTARIO.btnInventario) || 
            e.getSource().equals(FREPORTES.btnInventario)) {
            this.FLEERUSU.dispose();
            this.FCREARUSU.dispose();
            this.FCATEGORIA.dispose();
            this.FCREARPRODUCT.dispose();
            this.FLEERPRODUCT.dispose();
            this.FBINVENTARIO.dispose();
            this.FINVENTARIO.dispose();
            this.FREPORTES.dispose();
            CONTROLADOR_ADMINISTRADOR ctrl=new CONTROLADOR_ADMINISTRADOR();
            try {
                this.FBINVENTARIO.dispose();
                ctrl.IniciarFINVENTARIO();
            } catch (SQLException ex) {
                Logger.getLogger(CONTROLADOR_ADMINISTRADOR.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }// -- ------------abrir reportes
        if (e.getSource().equals(FLEERUSU.btnReportes)  || 
            e.getSource().equals(FCREARUSU.btnReportes) ||
            e.getSource().equals(FCATEGORIA.btnReportes) || 
            e.getSource().equals(FCREARPRODUCT.btnReportes) || 
            e.getSource().equals(FLEERPRODUCT.btnReportes) || 
            e.getSource().equals(FBINVENTARIO.btnReportes) ||
            e.getSource().equals(FINVENTARIO.btnReportes) || 
            e.getSource().equals(FREPORTES.btnReportes)) {
            this.FLEERUSU.dispose();
            this.FCREARUSU.dispose();
            this.FCATEGORIA.dispose();
            this.FCREARPRODUCT.dispose();
            this.FLEERPRODUCT.dispose();
            this.FBINVENTARIO.dispose();
            this.FINVENTARIO.dispose();
            this.FREPORTES.dispose();
            CONTROLADOR_ADMINISTRADOR ctrl=new CONTROLADOR_ADMINISTRADOR();
            ctrl.IniciarFREPORTE();
 

        
        
        
        
        }// -- ------------abrir productos
        if (e.getSource().equals(FLEERUSU.btnProductos)  || 
            e.getSource().equals(FCREARUSU.btnProductos) ||
            e.getSource().equals(FCATEGORIA.btnProductos) || 
            e.getSource().equals(FCREARPRODUCT.btnProductos) || 
            e.getSource().equals(FLEERPRODUCT.btnProductos) || 
            e.getSource().equals(FBINVENTARIO.btnProductos) ||
            e.getSource().equals(FINVENTARIO.btnProductos) || 
            e.getSource().equals(FREPORTES.btnProductos)) {
            this.FLEERUSU.dispose();
            this.FCREARUSU.dispose();
            this.FCATEGORIA.dispose();
            this.FCREARPRODUCT.dispose();
            this.FLEERPRODUCT.dispose();
            this.FBINVENTARIO.dispose();
            this.FINVENTARIO.dispose();
            this.FREPORTES.dispose();
            CONTROLADOR_ADMINISTRADOR ctrl=new CONTROLADOR_ADMINISTRADOR();
            ctrl.IniciarFLEERPRODUCTO();
 

        
        
        
        
        }// -- ------------abrir categoria
        if (e.getSource().equals(FLEERUSU.btnCategoria)  || 
            e.getSource().equals(FCREARUSU.btnCategoria) ||
            e.getSource().equals(FCATEGORIA.btnCategoria) || 
            e.getSource().equals(FCREARPRODUCT.btnCategoria) || 
            e.getSource().equals(FLEERPRODUCT.btnCategoria) || 
            e.getSource().equals(FBINVENTARIO.btnCategoria) ||
            e.getSource().equals(FINVENTARIO.btnCategoria) || 
            e.getSource().equals(FREPORTES.btnCategoria)) {
            this.FLEERUSU.dispose();
            this.FCREARUSU.dispose();
            this.FCATEGORIA.dispose();
            this.FCREARPRODUCT.dispose();
            this.FLEERPRODUCT.dispose();
            this.FBINVENTARIO.dispose();
            this.FINVENTARIO.dispose();
            this.FREPORTES.dispose();
            CONTROLADOR_ADMINISTRADOR ctrl=new CONTROLADOR_ADMINISTRADOR();
            ctrl.IniciarFCATEGORIA();
 

        
        
        
        
        }// -- ------------abrir stock
        if (e.getSource().equals(FLEERUSU.btnStock)  || 
            e.getSource().equals(FCREARUSU.btnStock) ||
            e.getSource().equals(FCATEGORIA.btnStock) || 
            e.getSource().equals(FCREARPRODUCT.btnStock) || 
            e.getSource().equals(FLEERPRODUCT.btnStock) || 
            e.getSource().equals(FBINVENTARIO.btnStock) ||
            e.getSource().equals(FINVENTARIO.btnStock) || 
            e.getSource().equals(FREPORTES.btnStock)) {
            this.FLEERUSU.dispose();
            this.FCREARUSU.dispose();
            this.FCATEGORIA.dispose();
            this.FCREARPRODUCT.dispose();
            this.FLEERPRODUCT.dispose();
            this.FBINVENTARIO.dispose();
            this.FINVENTARIO.dispose();
            this.FREPORTES.dispose();
            CONTROLADOR_ADMINISTRADOR ctrl=new CONTROLADOR_ADMINISTRADOR();
            ctrl.IniciarFBINVENTARIO();
 

        
        
        
        
        }if (e.getSource().equals(FREPORTESP.btnMOSTRARV)) {
            try {
                MOSTRARVENTASP();
            } catch (SQLException ex) {
                Logger.getLogger(CONTROLADOR_ADMINISTRADOR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }if (e.getSource().equals(FREPORTES.btnMOSTRARV)) {
            try {
                MOSTRARVENTAS();
            } catch (SQLException ex) {
                Logger.getLogger(CONTROLADOR_ADMINISTRADOR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }if(e.getSource().equals(FBINVENTARIOP.btnInventario)  || 
            e.getSource().equals(FINVENTARIOP.btnInventario) ||
            e.getSource().equals(FREPORTESP.btnInventario)) {
            this.FBINVENTARIOP.dispose();
            this.FBINVENTARIOP.dispose();
            this.FREPORTESP.dispose();
              
            CONTROLADOR_ADMINISTRADOR ctrl=new CONTROLADOR_ADMINISTRADOR();
                    ctrl.IniciarFBINVENTARIOP();
        }if(e.getSource().equals(FBINVENTARIOP.btnstock)  || 
            e.getSource().equals(FINVENTARIOP.btnstock) ||
            e.getSource().equals(FREPORTESP.btnstock)) {
             this.FBINVENTARIOP.dispose();
            this.FBINVENTARIOP.dispose();
            this.FREPORTESP.dispose();
              
            CONTROLADOR_ADMINISTRADOR ctrl=new CONTROLADOR_ADMINISTRADOR();
            try {
                ctrl.IniciarFINVENTARIOP();
            } catch (SQLException ex) {
                Logger.getLogger(CONTROLADOR_ADMINISTRADOR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }if(e.getSource().equals(FBINVENTARIOP.btnreporte)  || 
            e.getSource().equals(FINVENTARIOP.btnreporte) ||
            e.getSource().equals(FREPORTESP.btnreporte)) {
              this.FBINVENTARIOP.dispose();
            this.FBINVENTARIOP.dispose();
            this.FREPORTESP.dispose();  
              
            CONTROLADOR_ADMINISTRADOR ctrl=new CONTROLADOR_ADMINISTRADOR();
                    ctrl.IniciarFREPORTEP();
        }
        
        
        
        
    //*********************************************************************************************************************************************
    //*********************************************************************************************************************************************
    //*********************************************************************************************************************************************

        
        

    }
         ///METODOS     
      public void Limpiar(){
     FLEERUSU.txtID.setText(null);
     FLEERUSU.txtName.setText(null);
     FLEERUSU.txtpass.setText(null);
     FLEERUSU.txtuser.setText(null);
 
     
 } 
       public void LimpiarCATEGORIA(){
     FCATEGORIA.txtDescriocion.setText(null);
     FCATEGORIA.txtnameCategoria.setText(null);
     
                   
}
       /*        public Blob imgReturn(FileInputStream fis,int longi ){
       
       
       return imgReturn(fis, longi);
       }*/
       public void ListarCategorias(){
            //-----------------
            DAO_ADMINISTRADOR DAOADMIN=new DAO_ADMINISTRADOR();
           ArrayList listaCategoria=new ArrayList();
            FCREARPRODUCT.cboCategoria.removeAllItems();
            listaCategoria=DAOADMIN.Listar_CATEGORIA();
            Iterator iterator=listaCategoria.iterator();
            FCREARPRODUCT.cboCategoria.addItem("SELECCIONAR");
            while (iterator.hasNext()) {            
            CATEGORIA CAT=(CATEGORIA)iterator.next();
            FCREARPRODUCT.cboCategoria.addItem(CAT.getIDCATEGORIAC()+" - "+CAT.getNAMEC());
              

           
        } 
            
            
       }
       
          public void MOSTRARVENTAS() throws SQLException{
           DefaultTableModel modelo=new DefaultTableModel();
            FREPORTES.jtableVentas.setModel(modelo);
            PreparedStatement ps=null;
            ResultSet rs=null;
            CONEXION conn=new CONEXION();
            Connection con=conn.getConexion();
             String sqlconsulta="SELECT D.IDSERIAL, C.Name AS CLIENTE, U.NAME AS CAJERO, P.NAMEPROD AS PRODUCTO, D.CANTIDAD, D.SUBTOTAL, D.IGV, D.TOTAL, S.FECHA FROM datallev D INNER JOIN producto P ON P.IDPRODUCTO=D.IDPRODUCTO INNER JOIN seriall S ON S.IDSERIAL=D.IDSERIAL INNER JOIN cliente C ON C.IDCLIENTE=S.IDCLIENTE INNER JOIN userr U ON U.IDUSER=S.IDUSER;";
             ps=con.prepareStatement(sqlconsulta);
             rs=ps.executeQuery();
             ResultSetMetaData rsMD=rs.getMetaData();
             int cantidadColumnas=rsMD.getColumnCount();
             modelo.addColumn("ID SERIE");
             modelo.addColumn("CLIENTE");
             modelo.addColumn("EMPLEADO");
             modelo.addColumn("PRODUCTO");
              modelo.addColumn("CANTIDAD");
             modelo.addColumn("SUB TOTAL");
             modelo.addColumn("IGV");
             modelo.addColumn("TOTAL");
             modelo.addColumn("FECHA VENTA");
             
             
            while (rs.next()){
                Object[] filas=new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i]=rs .getObject(i+1);
                    
                }
                modelo.addRow(filas);
            }
       }
       public void MOSTRARVENTASP() throws SQLException{
           DefaultTableModel modelo=new DefaultTableModel();
            FREPORTESP.jtableVentas.setModel(modelo);
            PreparedStatement ps=null;
            ResultSet rs=null;
            CONEXION conn=new CONEXION();
            Connection con=conn.getConexion();
             String sqlconsulta="SELECT D.IDSERIAL, C.Name AS CLIENTE, U.NAME AS CAJERO, P.NAMEPROD AS PRODUCTO, D.CANTIDAD, D.SUBTOTAL, D.IGV, D.TOTAL, S.FECHA FROM datallev D INNER JOIN producto P ON P.IDPRODUCTO=D.IDPRODUCTO INNER JOIN seriall S ON S.IDSERIAL=D.IDSERIAL INNER JOIN cliente C ON C.IDCLIENTE=S.IDCLIENTE INNER JOIN userr U ON U.IDUSER=S.IDUSER;";
             ps=con.prepareStatement(sqlconsulta);
             rs=ps.executeQuery();
             ResultSetMetaData rsMD=rs.getMetaData();
             int cantidadColumnas=rsMD.getColumnCount();
             modelo.addColumn("ID SERIE");
             modelo.addColumn("CLIENTE");
             modelo.addColumn("EMPLEADO");
             modelo.addColumn("PRODUCTO");
              modelo.addColumn("CANTIDAD");
             modelo.addColumn("SUB TOTAL");
             modelo.addColumn("IGV");
             modelo.addColumn("TOTAL");
             modelo.addColumn("FECHA VENTA");
             
             
            while (rs.next()){
                Object[] filas=new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i]=rs .getObject(i+1);
                    
                }
                modelo.addRow(filas);
            }
       }
         public void ListarCategoriasLEEP(){
            //-----------------
            DAO_ADMINISTRADOR DAOADMIN=new DAO_ADMINISTRADOR();
           ArrayList listaCategoria=new ArrayList();
            FLEERPRODUCT.cbocategoria.removeAllItems();
            listaCategoria=DAOADMIN.Listar_CATEGORIA();
            Iterator iterator=listaCategoria.iterator();
            FLEERPRODUCT.cbocategoria.addItem("SELECCIONAR");
            while (iterator.hasNext()) {            
            CATEGORIA CAT=(CATEGORIA)iterator.next();
            FLEERPRODUCT.cbocategoria.addItem(CAT.getIDCATEGORIAC()+" - "+CAT.getNAMEC());
              

           
        } 
         }
        
       public void LimpiarFCREARPROD(){
     FCREARPRODUCT.txtNOMBREP.setText(null);
     FCREARPRODUCT.txtPrecio.setText(null);
     FCREARPRODUCT.txtstock.setText(null);
     FCREARPRODUCT.cboCategoria.setSelectedIndex(0);
      FCREARPRODUCT.btnGuardarIMG.setText(null);
                   
}
       
        public void LimpiarFLEERPR(){
     FLEERPRODUCT.txtcodigo.setText(null);
     FLEERPRODUCT.txtname.setText(null);
     FLEERPRODUCT.txtprecion.setText(null);
     FLEERPRODUCT.cbocategoria.setSelectedIndex(0);
      FLEERPRODUCT.txtstock.setText(null);
                   
}
       
       public void ListarProducto( ) throws SQLException  {
           DefaultTableModel modelo=new DefaultTableModel();
            FLEERPRODUCT.jtableProducto.setModel(modelo);
            PreparedStatement ps=null;
            ResultSet rs=null;
            CONEXION conn=new CONEXION();
            Connection con=conn.getConexion();
             String sqlconsultaP="SELECT   P.CODIGO,  P.NAMEPROD,C.NAME AS Categoria, P.PRECIO, P.STOCK, P.IMG FROM producto P\n" +
"INNER JOIN categoria C ON P.IDCATEGORIA=C.IDCATEGORIA;";
             ps=con.prepareStatement(sqlconsultaP);
             rs=ps.executeQuery();
             ResultSetMetaData rsMD=rs.getMetaData();
             int cantidadColumnas=rsMD.getColumnCount();
             modelo.addColumn("CODIGO");
             modelo.addColumn("PRODUCTO");
             modelo.addColumn("CATEGORIA");
             modelo.addColumn("PRECIO");
             modelo.addColumn("STOCK");
             
             
            while (rs.next()){
                Object[] filas=new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i]=rs .getObject(i+1);
                    
                }
                modelo.addRow(filas);
            }
       }
       
       
       public void MostrarUusuarios() throws SQLException{
           DefaultTableModel modelo=new DefaultTableModel();
            FLEERUSU.jtableMOSTRARUSUARIO.setModel(modelo);
            PreparedStatement ps=null;
            ResultSet rs=null;
            CONEXION conn=new CONEXION();
            Connection con=conn.getConexion();
             String sqlconsulta="SELECT u.IDUSER,u.NAME ,r.Nombre_rol, u.USER  FROM userr U\n" +
"INNER JOIN rol r ON r.ID_Rol=u.ID_Rol;";
             ps=con.prepareStatement(sqlconsulta);
             rs=ps.executeQuery();
             ResultSetMetaData rsMD=rs.getMetaData();
             int cantidadColumnas=rsMD.getColumnCount();
             modelo.addColumn("ID USUARIO");
             modelo.addColumn("NOMBRE Y APELLIDO");
             modelo.addColumn("CARGO");
             modelo.addColumn("CORREO");
             
             
             
            while (rs.next()){
                Object[] filas=new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i]=rs .getObject(i+1);
                    
                }
                modelo.addRow(filas);
            }
       }
        public int n(){
            int nd=0;
            switch(FLEERPRODUCT.jtableProducto.getValueAt(FLEERPRODUCT.jtableProducto.getSelectedRow(), 2).toString()){
                case "ADMINISTRADOR":
                    nd=1;
                    break;
                case "PROVEDOR":
                 nd=2;
                    break;
                case "CAJERO":
                 nd=3;
                    break;
            }
                 return nd;
        }
           
         public void ListarProductoFLISTAR() throws SQLException  {
           DefaultTableModel modelo=new DefaultTableModel();
            FBINVENTARIO.jtableProducto.setModel(modelo);
            PreparedStatement ps=null;
            ResultSet rs=null;
            CONEXION conn=new CONEXION();
            Connection con=conn.getConexion();
             String sqlconsultaP="SELECT   P.CODIGO,  P.NAMEPROD,C.NAME AS Categoria, P.PRECIO, P.STOCK, P.IMG FROM producto P\n" +
"INNER JOIN categoria C ON P.IDCATEGORIA=C.IDCATEGORIA;";
             ps=con.prepareStatement(sqlconsultaP);
             rs=ps.executeQuery();
             ResultSetMetaData rsMD=rs.getMetaData();
             int cantidadColumnas=rsMD.getColumnCount();
             modelo.addColumn("CODIGO");
             modelo.addColumn("PRODUCTO");
             modelo.addColumn("CATEGORIA");
             modelo.addColumn("PRECIO");
             modelo.addColumn("STOCK");
             
             
            while (rs.next()){
                Object[] filas=new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i]=rs .getObject(i+1);
                    
                }
                modelo.addRow(filas);
            }
       }
          public void ListarProductoFLISTARP() throws SQLException  {
           DefaultTableModel modelo=new DefaultTableModel();
            FBINVENTARIOP.jtableProducto.setModel(modelo);
            PreparedStatement ps=null;
            ResultSet rs=null;
            CONEXION conn=new CONEXION();
            Connection con=conn.getConexion();
             String sqlconsultaP="SELECT   P.CODIGO,  P.NAMEPROD,C.NAME AS Categoria, P.PRECIO, P.STOCK, P.IMG FROM producto P\n" +
"INNER JOIN categoria C ON P.IDCATEGORIA=C.IDCATEGORIA;";
             ps=con.prepareStatement(sqlconsultaP);
             rs=ps.executeQuery();
             ResultSetMetaData rsMD=rs.getMetaData();
             int cantidadColumnas=rsMD.getColumnCount();
             modelo.addColumn("CODIGO");
             modelo.addColumn("PRODUCTO");
             modelo.addColumn("CATEGORIA");
             modelo.addColumn("PRECIO");
             modelo.addColumn("STOCK");
             
             
            while (rs.next()){
                Object[] filas=new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i]=rs .getObject(i+1);
                    
                }
                modelo.addRow(filas);
            }
       }
                public void ListarProductoFINVENTARIOG( ) throws SQLException  {
           DefaultTableModel modelo=new DefaultTableModel();
            FINVENTARIO.jtableProducto.setModel(modelo);
            PreparedStatement ps=null;
            ResultSet rs=null;
            CONEXION conn=new CONEXION();
            Connection con=conn.getConexion();
             String sqlconsultaP="SELECT   P.CODIGO,  P.NAMEPROD,C.NAME AS Categoria, P.PRECIO, P.STOCK, P.IMG FROM producto P\n" +
"INNER JOIN categoria C ON P.IDCATEGORIA=C.IDCATEGORIA;";
             ps=con.prepareStatement(sqlconsultaP);
             rs=ps.executeQuery();
             ResultSetMetaData rsMD=rs.getMetaData();
             int cantidadColumnas=rsMD.getColumnCount();
             modelo.addColumn("CODIGO");
             modelo.addColumn("PRODUCTO");
             modelo.addColumn("CATEGORIA");
             modelo.addColumn("PRECIO");
             modelo.addColumn("STOCK");
             
             
            while (rs.next()){
                Object[] filas=new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i]=rs .getObject(i+1);
                    
                }
                modelo.addRow(filas);
            }
             FINVENTARIO.jtableProducto.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent Mouse_Evt){
                    JTable table=(JTable) Mouse_Evt.getSource();
                    Point point=Mouse_Evt.getPoint();
                    int row=table.rowAtPoint(point);
                    if (Mouse_Evt.getClickCount()==1) {
                        
                        ///capturar datos
                         
                     FINVENTARIO.txtcodigo.setText(FINVENTARIO.jtableProducto.getValueAt(FINVENTARIO.jtableProducto.getSelectedRow(), 0).toString());
                    
                      
                   //  Blob blob= FLEERPRODUCT.jtableProducto.getValueAt(FLEERPRODUCT.jtableProducto.getSelectedRow(), 0).toString();
                      
                          try {
            PRODUCTO PRO=new PRODUCTO();
            DAO_ADMINISTRADOR DAOADMIN=new DAO_ADMINISTRADOR();
            PRO.setIDPRODUCTOP(FINVENTARIO.txtcodigo.getText());
            DAOADMIN.MOSTRAR_IMG(PRO);
            PRO.getRLP();
             Blob blob=PRO.getRLP();
             byte[] data=blob.getBytes(1, (int)blob.length());
             BufferedImage img=null;
             img=ImageIO.read(new ByteArrayInputStream(data));
             ImageIcon icono=new ImageIcon(img);
             Icon imagen=new ImageIcon(icono.getImage().getScaledInstance(FINVENTARIO.btnGuardarIMG.getWidth(), FINVENTARIO.btnGuardarIMG.getHeight(), Image.SCALE_DEFAULT));
             FINVENTARIO.btnGuardarIMG.setIcon(imagen); 
             
        } catch (Exception es) {
        }                         
                    }
                    
                }
               
        
        });
       }
                  public void ListarProductoFINVENTARIOGP( ) throws SQLException  {
           DefaultTableModel modelo=new DefaultTableModel();
            FINVENTARIO.jtableProducto.setModel(modelo);
            PreparedStatement ps=null;
            ResultSet rs=null;
            CONEXION conn=new CONEXION();
            Connection con=conn.getConexion();
             String sqlconsultaP="SELECT   P.CODIGO,  P.NAMEPROD,C.NAME AS Categoria, P.PRECIO, P.STOCK, P.IMG FROM producto P\n" +
"INNER JOIN categoria C ON P.IDCATEGORIA=C.IDCATEGORIA;";
             ps=con.prepareStatement(sqlconsultaP);
             rs=ps.executeQuery();
             ResultSetMetaData rsMD=rs.getMetaData();
             int cantidadColumnas=rsMD.getColumnCount();
             modelo.addColumn("CODIGO");
             modelo.addColumn("PRODUCTO");
             modelo.addColumn("CATEGORIA");
             modelo.addColumn("PRECIO");
             modelo.addColumn("STOCK");
             
             
            while (rs.next()){
                Object[] filas=new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i]=rs .getObject(i+1);
                    
                }
                modelo.addRow(filas);
            }
             FINVENTARIO.jtableProducto.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent Mouse_Evt){
                    JTable table=(JTable) Mouse_Evt.getSource();
                    Point point=Mouse_Evt.getPoint();
                    int row=table.rowAtPoint(point);
                    if (Mouse_Evt.getClickCount()==1) {
                        
                        ///capturar datos
                         
                     FINVENTARIO.txtcodigo.setText(FINVENTARIO.jtableProducto.getValueAt(FINVENTARIO.jtableProducto.getSelectedRow(), 0).toString());
                    
                      
                   //  Blob blob= FLEERPRODUCT.jtableProducto.getValueAt(FLEERPRODUCT.jtableProducto.getSelectedRow(), 0).toString();
                      
                          try {
            PRODUCTO PRO=new PRODUCTO();
            DAO_ADMINISTRADOR DAOADMIN=new DAO_ADMINISTRADOR();
            PRO.setIDPRODUCTOP(FINVENTARIO.txtcodigo.getText());
            DAOADMIN.MOSTRAR_IMG(PRO);
            PRO.getRLP();
             Blob blob=PRO.getRLP();
             byte[] data=blob.getBytes(1, (int)blob.length());
             BufferedImage img=null;
             img=ImageIO.read(new ByteArrayInputStream(data));
             ImageIcon icono=new ImageIcon(img);
             Icon imagen=new ImageIcon(icono.getImage().getScaledInstance(FINVENTARIO.btnGuardarIMG.getWidth(), FINVENTARIO.btnGuardarIMG.getHeight(), Image.SCALE_DEFAULT));
             FINVENTARIO.btnGuardarIMG.setIcon(imagen); 
             
        } catch (Exception es) {
        }                         
                    }
                    
                }
               
        
        });
       }
                  
                                   public void ListarProductoFINVENTARIOGPP( ) throws SQLException  {
           DefaultTableModel modelo=new DefaultTableModel();
            FINVENTARIOP.jtableProducto.setModel(modelo);
            PreparedStatement ps=null;
            ResultSet rs=null;
            CONEXION conn=new CONEXION();
            Connection con=conn.getConexion();
             String sqlconsultaP="SELECT   P.CODIGO,  P.NAMEPROD,C.NAME AS Categoria, P.PRECIO, P.STOCK, P.IMG FROM producto P\n" +
"INNER JOIN categoria C ON P.IDCATEGORIA=C.IDCATEGORIA;";
             ps=con.prepareStatement(sqlconsultaP);
             rs=ps.executeQuery();
             ResultSetMetaData rsMD=rs.getMetaData();
             int cantidadColumnas=rsMD.getColumnCount();
             modelo.addColumn("CODIGO");
             modelo.addColumn("PRODUCTO");
             modelo.addColumn("CATEGORIA");
             modelo.addColumn("PRECIO");
             modelo.addColumn("STOCK");
             
             
            while (rs.next()){
                Object[] filas=new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i]=rs .getObject(i+1);
                    
                }
                modelo.addRow(filas);
            }
             FINVENTARIOP.jtableProducto.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent Mouse_Evt){
                    JTable table=(JTable) Mouse_Evt.getSource();
                    Point point=Mouse_Evt.getPoint();
                    int row=table.rowAtPoint(point);
                    if (Mouse_Evt.getClickCount()==1) {
                        
                        ///capturar datos
                         
                     FINVENTARIOP.txtcodigo.setText(FINVENTARIOP.jtableProducto.getValueAt(FINVENTARIOP.jtableProducto.getSelectedRow(), 0).toString());
                    
                      
                   //  Blob blob= FLEERPRODUCT.jtableProducto.getValueAt(FLEERPRODUCT.jtableProducto.getSelectedRow(), 0).toString();
                      
                          try {
            PRODUCTO PRO=new PRODUCTO();
            DAO_ADMINISTRADOR DAOADMIN=new DAO_ADMINISTRADOR();
            PRO.setIDPRODUCTOP(FINVENTARIOP.txtcodigo.getText());
            DAOADMIN.MOSTRAR_IMG(PRO);
            PRO.getRLP();
             Blob blob=PRO.getRLP();
             byte[] data=blob.getBytes(1, (int)blob.length());
             BufferedImage img=null;
             img=ImageIO.read(new ByteArrayInputStream(data));
             ImageIcon icono=new ImageIcon(img);
             Icon imagen=new ImageIcon(icono.getImage().getScaledInstance(FINVENTARIOP.btnGuardarIMG.getWidth(), FINVENTARIOP.btnGuardarIMG.getHeight(), Image.SCALE_DEFAULT));
             FINVENTARIOP.btnGuardarIMG.setIcon(imagen); 
             
        } catch (Exception es) {
        }                         
                    }
                    
                }
               
        
        });
       }
                /*  SELECT        *
     FROM            producto
     WHERE        (NAMEPROD LIKE 'APATILLAS%')
     or  (NAMEPROD LIKE '%APATILLAS')
     or  (NAMEPROD LIKE 'APATILLAS%%')
     order by IDPRODUCTO*/
                    public void ListarProductoFILTRO(String x, String Atributo) throws SQLException  {
           DefaultTableModel modelo=new DefaultTableModel();
            FINVENTARIO.jtableProducto.setModel(modelo);
            PreparedStatement ps=null;
            ResultSet rs=null; 
            CONEXION conn=new CONEXION();
            Connection con=conn.getConexion();
             String sqlconsultaP="SELECT   P.CODIGO,  P.NAMEPROD,C.NAME AS Categoria, P.PRECIO, P.STOCK, P.IMG FROM producto P\n" +
"INNER JOIN categoria C ON P.IDCATEGORIA=C.IDCATEGORIA\n" +
"     WHERE        ("+Atributo+" LIKE '"+x+"%')\n" +
"     or  ("+Atributo+" LIKE '%"+x+"')\n" +
"     or  ("+Atributo+" LIKE '"+x+"%%')\n" +
"     order by IDPRODUCTO";
             ps=con.prepareStatement(sqlconsultaP);
             rs=ps.executeQuery();
             ResultSetMetaData rsMD=rs.getMetaData();
             int cantidadColumnas=rsMD.getColumnCount();
             modelo.addColumn("CODIGO");
             modelo.addColumn("PRODUCTO");
             modelo.addColumn("CATEGORIA");
             modelo.addColumn("PRECIO");
             modelo.addColumn("STOCK");
             
             
            while (rs.next()){
                Object[] filas=new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i]=rs .getObject(i+1);
                    
                }
                modelo.addRow(filas);
            }
             FINVENTARIO.jtableProducto.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent Mouse_Evt){
                    JTable table=(JTable) Mouse_Evt.getSource();
                    Point point=Mouse_Evt.getPoint();
                    int row=table.rowAtPoint(point);
                    if (Mouse_Evt.getClickCount()==1) {
                        
                        ///capturar datos
                         
                     FINVENTARIO.txtcodigo.setText(FINVENTARIO.jtableProducto.getValueAt(FINVENTARIO.jtableProducto.getSelectedRow(), 0).toString());
                    
                      
                   //  Blob blob= FLEERPRODUCT.jtableProducto.getValueAt(FLEERPRODUCT.jtableProducto.getSelectedRow(), 0).toString();
                      
                          try {
            PRODUCTO PRO=new PRODUCTO();
            DAO_ADMINISTRADOR DAOADMIN=new DAO_ADMINISTRADOR();
            PRO.setIDPRODUCTOP(FINVENTARIO.txtcodigo.getText());
            DAOADMIN.MOSTRAR_IMG(PRO);
            PRO.getRLP();
             Blob blob=PRO.getRLP();
             byte[] data=blob.getBytes(1, (int)blob.length());
             BufferedImage img=null;
             img=ImageIO.read(new ByteArrayInputStream(data));
             ImageIcon icono=new ImageIcon(img);
             Icon imagen=new ImageIcon(icono.getImage().getScaledInstance(FINVENTARIO.btnGuardarIMG.getWidth(), FINVENTARIO.btnGuardarIMG.getHeight(), Image.SCALE_DEFAULT));
             FINVENTARIO.btnGuardarIMG.setIcon(imagen); 
             
        } catch (Exception es) {
        }                         
                    }
                    
                }
               
        
        });
       }
                    
      public void LimpiarFINVENTARIO(){
    FINVENTARIO.txtFName.setText(null);
    FINVENTARIO.txtFcodigo.setText(null);
    FINVENTARIO.txtcodigo.setText(null);
}
       public void LimpiarFINVENTARIOP(){
    FINVENTARIOP.txtFName.setText(null);
    FINVENTARIOP.txtFcodigo.setText(null);
    FINVENTARIOP.txtcodigo.setText(null);
}
      
        
      
                    
     
        
}