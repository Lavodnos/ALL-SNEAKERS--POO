 
package CONTROLADOR;

import MODELO.CLIENTE;
import MODELO.DAO_CAJERO;
import MODELO.DETALLE_VENTA;
import MODELO.PRODUCTO;
import MODELO.SERIAL;
import VISTA.CAJERO.CAJERO_VJF;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.MouseEvent;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author kimbe
 */
public class CONTROLADOR_CAJERO implements ActionListener{
//--DECLARAMOS A LOS JFRAME FORMULARIO
    CAJERO_VJF FCAJERO;
  double SubtotalF=0,SubtotalACUMULADOF=0,totalPagar=0, igegeneral=0;
    ArrayList<DETALLE_VENTA> ListaDetllVenta=new ArrayList<>();

        //--CONSTRUCTOR
    public CONTROLADOR_CAJERO() {
        this.FCAJERO=new CAJERO_VJF();
    }
    
     //--METODOS DE INICIO
    public void IniciarCaja(int idUSER, String correo, String Name){
            FCAJERO.btnAgregarProducto.addActionListener(this);
            FCAJERO.btnCalcularVuelto.addActionListener(this);
            FCAJERO.btnVenta.addActionListener(this);
            FCAJERO.btnagregarDNI.addActionListener(this);
           // FCAJERO.btnAgregarProducto.addActionListener(this);
           FCAJERO.txtIDUSER.enable();
           FCAJERO.txtIGV.enable();
           FCAJERO.txtTotal.enable();
           FCAJERO.txtVuelto.enable();
            ListarProductos();
            ListarCLientes();
            IniciarJtble();
            FCAJERO.txtIDUSER.setText(idUSER+"");
            FCAJERO.txtname.setText(Name+"");
            FCAJERO.txtcorreo.setText(correo+"");
            FCAJERO.setLocationRelativeTo(null);
            FCAJERO.setVisible(true);
           
        }
     
    
    
    
    
    //...........................................................................................................................................
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(FCAJERO.btnagregarDNI)) {
            
            //PRO.setIDCATEGORIAP(idCa.substring(0, 2)); ESTO ES PARA AGARRA SOLO DNI
            CLIENTE CLI=new CLIENTE();
             CLIENTE CLIC=new CLIENTE();
            CLI.setDNICC(FCAJERO.txtDNI.getText());
            CLIC.setDNICC(FCAJERO.txtDNI.getText());
            CLI.setNameC(FCAJERO.txtNameDni.getText());
            DAO_CAJERO DAC=new DAO_CAJERO();
           /// DAC.BUSQUEDA_CLIENTE(CLIC);
            
             if (DAC.CREAR_CLIENTE(CLI)==true) {
                JOptionPane.showMessageDialog(null, "CLIENTE CREADO !!");

                ListarCLientes();
                FCAJERO.txtDNI.setText(null);
                FCAJERO.txtNameDni.setText(null);
            }else{
                    System.out.println("ERROR");
                }
 
            
        }if (e.getSource().equals(FCAJERO.btnAgregarProducto)) {
            ///verificar campos
            if (FCAJERO.cboProducto.getSelectedItem().toString().equalsIgnoreCase("SELECCIONAR")) {
            JOptionPane.showMessageDialog(null, "SELECIONE PRODUCTO");
        }else
            {if (FCAJERO.txtCantidad.getText().isEmpty()) {
                      JOptionPane.showMessageDialog(null, "INGRESE CANTIDAD");
                }else{
                    PRODUCTO PRO=new PRODUCTO(); //consulta producto
                     PRODUCTO PROD=new PRODUCTO(); //para enviar datos
                    DAO_CAJERO daoc=new DAO_CAJERO();
                    PRO.setNAMEPRODP(FCAJERO.cboProducto.getSelectedItem().toString());
                    daoc.BUSQUEDAPRODU(PRO);
                    
                    if ( Integer.parseInt(FCAJERO.txtCantidad.getText())<= Integer.parseInt(PRO.getSTOCKP())) {
                        double subtotal, totalpagar;
                        int cantidad;
                        cantidad =Integer.parseInt(FCAJERO.txtCantidad.getText());
                        subtotal=Double.parseDouble(PRO.getPRECIOP())*cantidad;
                        totalpagar=Double.parseDouble(PRO.getIDCATEGORIAP())*cantidad+subtotal;
                        
                        ///ALMACENAR LOS DATOS EN NUESTRO MODELO DE DATOS DETALLE VENTA 
                        ///creando objeto
                        DETALLE_VENTA DTALLEPRODUCT=new DETALLE_VENTA();
                        DTALLEPRODUCT.setIDPRODUCTOD(PRO.getIDPRODUCTOP());//CODIGO PRODUCTO    
                        
                        DTALLEPRODUCT.setIDSERIALD(PRO.getIDPRODUCTOP());///codigo pro
                        DTALLEPRODUCT.setIDPRODUCTOD(PRO.getNAMEPRODP());
                        DTALLEPRODUCT.setCANTIDADD(cantidad);
                        DTALLEPRODUCT.setExtra(PRO.getPRECIOP());
                        DTALLEPRODUCT.setSUBTOTALD(subtotal);
                        DTALLEPRODUCT.setIGVD(Math.round((Double.parseDouble(PRO.getIDCATEGORIAP())*cantidad)*100)/100);//esa variable estoy almacenando el igv desde la consuta
                        DTALLEPRODUCT.setTOTALD(totalpagar);
                       
                        //llenar el arraylist
                        ListaDetllVenta.add(DTALLEPRODUCT);
                        ///---------------
                        

                       
                         ///---------------
                        JOptionPane.showMessageDialog(null, "PRODCUTO AGREGADO");
                        ///JOptionPane.showMessageDialog(null, totalpagar);
                        FCAJERO.txtCantidad.setText(null);
                        ListarProductos();
                        OperacionesCAJA();
                           
                       
                    }else{
                        JOptionPane.showMessageDialog(null, "CANTIDAD SUPERA STOCK");
                    }
                }
            }
                        ListarJtableProducto(ListaDetllVenta);
                        
                        //llenamos los txt
                       
                        
        }if (e.getSource().equals(FCAJERO.btnCalcularVuelto)) {
            
           double monto=0, vuelto=0;
           monto=Double.parseDouble(FCAJERO.txtMonto.getText());
           vuelto=monto-Double.parseDouble(FCAJERO.txtTotal.getText());
          double rednovuelto=(double) Math.round(vuelto*100)/100;
           FCAJERO.txtVuelto.setText("S/. "+rednovuelto+"");
            
        }if (e.getSource().equals(FCAJERO.btnVenta)) {
            ///llamamos alos modelos de datos que utilizaremos
            SERIAL SER=new SERIAL();
            CLIENTE CLI=new CLIENTE();
            
            DETALLE_VENTA DTV=new DETALLE_VENTA();
            //llamamos al dao de cajero
            DAO_CAJERO DAOC=new DAO_CAJERO();
           String dnicliente=FCAJERO.cboCliente.getSelectedItem().toString()+"";
           CLI.setDNICC(dnicliente.substring(0, 8));
           DAOC.BUSQUEDA_CLIENTE(CLI);
           SER.setIDCLIENTES(CLI.getIDCLIENTEC());
           SER.setIDUSERS(FCAJERO.txtIDUSER.getText());
            if ( DAOC.CREAR_SERIAL(SER)) {
                 JOptionPane.showMessageDialog(null, "VENTA REALIZADA");
                for (DETALLE_VENTA elemento: ListaDetllVenta) {
                   DTV.setIDPRODUCTOD(elemento.getIDSERIALD());
                   DTV.setCANTIDADD(elemento.getCANTIDADD());
                   DTV.setSUBTOTALD(elemento.getSUBTOTALD());
                   DTV.setIGVD(elemento.getIGVD());
                   DTV.setTOTALD(elemento.getTOTALD());
                    if ( DAOC.CREAR_DETALLE_VENTA(DTV)) {
                        ///GENERANDO BOLETA
                        generarFacturaPDF(CLI.getDNICC(), CLI.getNameC());
                        
                    }else{
           JOptionPane.showMessageDialog(null, "ERROR");

                    }
                   
                }
        }else{
                /// JOptionPane.showMessageDialog(null, dnicliente.substring(0, 8));
                JOptionPane.showMessageDialog(null, "ERROR AL REGISTRAR VENTA");
            }
            LimpiarCAJA();
        }
 
        
        }
        
 
        //..................................................................Metodos.........................................................................
public void ListarProductos(){
    DAO_CAJERO DAOACAJE=new DAO_CAJERO();
           ArrayList listaPRODU=new ArrayList();
            FCAJERO.cboProducto.removeAllItems();
            listaPRODU=DAOACAJE.Listar_PRODUCTO();
            Iterator iterator=listaPRODU.iterator();
            FCAJERO.cboProducto.addItem("SELECCIONAR");
            while (iterator.hasNext()) {            
                PRODUCTO PRO=(PRODUCTO)iterator.next();
            FCAJERO.cboProducto.addItem(PRO.getNAMEPRODP());
            
}
            
}

public void ListarCLientes(){
    DAO_CAJERO DAOACAJE=new DAO_CAJERO();
           ArrayList listaCLIE=new ArrayList();
            FCAJERO.cboCliente.removeAllItems();
            listaCLIE=DAOACAJE.Listar_CLIENTE();
            Iterator iterator=listaCLIE.iterator();
            FCAJERO.cboCliente.addItem("SELECCIONAR");
            while (iterator.hasNext()) {            
                CLIENTE CLI=(CLIENTE)iterator.next();
            FCAJERO.cboCliente.addItem(CLI.getDNICC()+" - "+CLI.getNameC());
}
            
}
 DefaultTableModel modelo=new DefaultTableModel();

private void  IniciarJtble(){
   
    FCAJERO.jtableMostrarResumen.setModel(modelo);
     modelo.addColumn("N");
     modelo.addColumn("Nombre");
     modelo.addColumn("Cantidad");
     modelo.addColumn("P. Unitario");
     modelo.addColumn("Sub Total");
     modelo.addColumn("IGV");
     modelo.addColumn("Total a Pagar");
     modelo.addColumn("Accion");
  FCAJERO.jtableMostrarResumen.setModel(modelo);
  
}

     public void ListarJtableProducto(ArrayList<DETALLE_VENTA> Listapro){


        //DefaultTableModel modelo=new DefaultTableModel();

        modelo.setRowCount(Listapro.size());

        for (int i = 0; i < Listapro.size(); i++) {
        modelo.setValueAt(i+1, i, 0);
        modelo.setValueAt(Listapro.get(i).getIDPRODUCTOD(), i, 1);
        modelo.setValueAt(Listapro.get(i).getCANTIDADD(), i, 2);
        modelo.setValueAt(Listapro.get(i).getExtra(), i, 3);
        modelo.setValueAt(Listapro.get(i).getSUBTOTALD(), i, 4);
        modelo.setValueAt(Listapro.get(i).getIGVD(), i, 5);
        modelo.setValueAt(Listapro.get(i).getTOTALD(), i, 6);
        modelo.setValueAt("ELIMINAR", i, 7);


              
                
                ///llenar el sub total
                
              
                      
        }
        FCAJERO.jtableMostrarResumen.setModel(modelo);
        }
     
     
     public void OperacionesCAJA(){
         //reiniciando variables
         SubtotalACUMULADOF=0;
                igegeneral=0;
                totalPagar=0;
         for (DETALLE_VENTA elemento: ListaDetllVenta) {
                SubtotalACUMULADOF+=elemento.getSUBTOTALD();
                igegeneral+=elemento.getIGVD();
                totalPagar+=elemento.getTOTALD();
                
         }
         
         //redondear
         SubtotalACUMULADOF=(double) Math.round(SubtotalACUMULADOF*100)/100;
         igegeneral=(double) Math.round(igegeneral*100)/100;
         totalPagar=(double) Math.round(totalPagar*100)/100;
         //enviar datos
         FCAJERO.txtSubTotal.setText(String.valueOf(SubtotalACUMULADOF));
         FCAJERO.txtIGV.setText(String.valueOf(igegeneral));
         FCAJERO.txtTotal.setText(String.valueOf(totalPagar));
     }
      public void LimpiarCAJA(){
    FCAJERO.txtSubTotal.setText(null);
    FCAJERO.txtTotal.setText(null);
    FCAJERO.txtIGV.setText(null);
    FCAJERO.txtMonto.setText(null);
    FCAJERO.txtVuelto.setText(null);
       modelo.setRowCount(0);
      ListarCLientes();
      ListarProductos();
    
}////-------------GENERAR PDF
      
        public void generarFacturaPDF(String dni, String Nombre) {
       

      String fechaActual = "";
      String nombreArchivoPDFVenta = "";
        try {

            //cargar la fecha actual
            Date date = new Date();
            fechaActual = new SimpleDateFormat("yyyy/MM/dd").format(date);
            //cambiar el formato de la fecha de / a _
            String fechaNueva = "";
            for (int i = 0; i < fechaActual.length(); i++) {
                if (fechaActual.charAt(i) == '/') {
                    fechaNueva = fechaActual.replace("/", "_");
                }
            }

            nombreArchivoPDFVenta = "Venta_" + Nombre + "_" + fechaNueva + ".pdf";

            FileOutputStream archivo;
            File file = new File("src/pdf/" + nombreArchivoPDFVenta);
            archivo = new FileOutputStream(file);

            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();

            Image img = Image.getInstance("src/com/images/LogoAll.png");
            Paragraph fecha = new Paragraph();
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLUE);
            fecha.add(Chunk.NEWLINE); //agregar nueva linea
            fecha.add("Factura: 001" + "\nFecha: " + fechaActual + "\n\n");

            PdfPTable Encabezado = new PdfPTable(4);
            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);//quitar el borde de la tabla
            //tamaño de las celdas
            float[] ColumnaEncabezado = new float[]{20f, 30f, 70f, 40f};
            Encabezado.setWidths(ColumnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);
            //agregar celdas
            Encabezado.addCell(img);

            String ruc = "2141324";
            String nombre = "ALL SNEAKERS";
            String telefono = "967608502";
            String direccion = "AV LAS PALMERAS 15305, LOS OLIVOS";
            String razon = "TECZAP ALL SNEAKERS";

            Encabezado.addCell("");//celda vacia
            Encabezado.addCell("RUC: " + ruc + "\nNOMBRE: " + nombre + "\nTELEFONO: " + telefono + "\nDIRECCION: " + direccion + "\nRAZON SOCIAL: " + razon);
            Encabezado.addCell(fecha);
            doc.add(Encabezado);

            //CUERPO
            Paragraph cliente = new Paragraph();
            cliente.add(Chunk.NEWLINE);//nueva linea
            cliente.add("Datos del cliente: " + "\n\n");
            doc.add(cliente);

            //DATOS DEL CLIENTE
            PdfPTable tablaCliente = new PdfPTable(4);
            tablaCliente.setWidthPercentage(100);
            tablaCliente.getDefaultCell().setBorder(0);//quitar bordes
            //tamaño de las celdas
            float[] ColumnaCliente = new float[]{25f, 45f, 30f, 40f};
            tablaCliente.setWidths(ColumnaCliente);
            tablaCliente.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell cliente1 = new PdfPCell(new Phrase("Dni : ", negrita));
            PdfPCell cliente2 = new PdfPCell(new Phrase("Nombre : ", negrita));
            PdfPCell cliente3 = new PdfPCell(new Phrase("Telefono : ", negrita));
            PdfPCell cliente4 = new PdfPCell(new Phrase("Direccion : ", negrita));
            //quitar bordes 
            cliente1.setBorder(0);
            cliente2.setBorder(0);
            cliente3.setBorder(0);
            cliente4.setBorder(0);
            //agg celda a la tabla
            tablaCliente.addCell(cliente1);
            tablaCliente.addCell(cliente2);
 
            
            tablaCliente.addCell(Nombre);
            tablaCliente.addCell(dni);
           
            //agregar al documento
            doc.add(tablaCliente);
            
            //ESPACIO EN BLANCO
            Paragraph espacio = new Paragraph();
            espacio.add(Chunk.NEWLINE);
            espacio.add("");
            espacio.setAlignment(Element.ALIGN_CENTER);
            doc.add(espacio);
            
            //AGREGAR LOS PRODUCTOS
            PdfPTable tablaProducto = new PdfPTable(4);
            tablaProducto.setWidthPercentage(100);
            tablaProducto.getDefaultCell().setBorder(0);
            //tamaño de celdas
             float[] ColumnaProducto = new float[]{15f, 50f, 15f, 20f};
             tablaProducto.setWidths(ColumnaProducto);
             tablaProducto.setHorizontalAlignment(Element.ALIGN_LEFT);
             PdfPCell producto1 = new PdfPCell(new Phrase("Cantidad : ", negrita));
             PdfPCell producto2 = new PdfPCell(new Phrase("Descripcion : ", negrita));
             PdfPCell producto3 = new PdfPCell(new Phrase("Precio Unitario : ", negrita));
             PdfPCell producto4 = new PdfPCell(new Phrase("Precio Total : ", negrita));
             //quitar bordes
             producto1.setBorder(0);
             producto2.setBorder(0);
             producto3.setBorder(0);
             producto4.setBorder(0);
             //agregar color al encabezadi del producto
             producto1.setBackgroundColor(BaseColor.LIGHT_GRAY);
             producto2.setBackgroundColor(BaseColor.LIGHT_GRAY);
             producto3.setBackgroundColor(BaseColor.LIGHT_GRAY);
             producto4.setBackgroundColor(BaseColor.LIGHT_GRAY);
            //agg celda a la tabla
            tablaProducto.addCell(producto1);
            tablaProducto.addCell(producto2);
            tablaProducto.addCell(producto3);
            tablaProducto.addCell(producto4);
 
            for(int i = 0; i < FCAJERO.jtableMostrarResumen.getRowCount(); i++){
                String producto = FCAJERO.jtableMostrarResumen.getValueAt(i, 1).toString();
                String cantidad = FCAJERO.jtableMostrarResumen.getValueAt(i, 2).toString();
                String precio = FCAJERO.jtableMostrarResumen.getValueAt(i, 3).toString();
                String total = FCAJERO.jtableMostrarResumen.getValueAt(i, 6).toString();
              /// JOptionPane.showMessageDialog(null, FCAJERO.jtableMostrarResumen.getValueAt(i, 1).toString());
                tablaProducto.addCell(producto);
                tablaProducto.addCell(cantidad);
                tablaProducto.addCell(precio);
                tablaProducto.addCell(total);
            }
            
            //agregar al documento
            doc.add(tablaProducto);
            
            //Total pagar
            Paragraph info = new Paragraph();
            info.add(Chunk.NEWLINE);
            info.add("Total a pagar: " + FCAJERO.txtTotal.getText());
            info.setAlignment(Element.ALIGN_RIGHT);
            doc.add(info);
            
            //Firma
           Paragraph firma = new Paragraph();
           firma.add(Chunk.NEWLINE);
           firma.add("Cancelacion y firma\n\n");
           firma.add("_______________________");
           firma.setAlignment(Element.ALIGN_CENTER);
           doc.add(firma);
           
            //Mensaje
           Paragraph mensaje = new Paragraph();
           mensaje.add(Chunk.NEWLINE);
           mensaje.add("¡Gracias por su compra!");
           mensaje.setAlignment(Element.ALIGN_CENTER);
           doc.add(mensaje);
           
           //cerrar el documento y el archivo
           doc.close();
           archivo.close();
           
           //abrir el documento al ser generado automaticamente
            Desktop.getDesktop().open(file);
            
            
        } catch (DocumentException | IOException e) {
            System.out.println("Error en: " + e);
        }
    }
      
      
      
      
        }