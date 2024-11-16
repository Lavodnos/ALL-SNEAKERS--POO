
package MODELO;

import java.io.FileInputStream;
import java.sql.Blob;

/**
 *
 * @author kimbe
 */
public class PRODUCTO {
    String IDPRODUCTOP;
    String IDCATEGORIAP;
    String NAMEPRODP;
    String PRECIOP;
    String STOCKP;
    Blob RLP;

    public PRODUCTO() {
    }

    public PRODUCTO(String IDPRODUCTOP, String IDCATEGORIAP, String NAMEPRODP, String PRECIOP, String STOCKP, Blob RLP) {
        this.IDPRODUCTOP = IDPRODUCTOP;
        this.IDCATEGORIAP = IDCATEGORIAP;
        this.NAMEPRODP = NAMEPRODP;
        this.PRECIOP = PRECIOP;
        this.STOCKP = STOCKP;
        this.RLP = RLP;
    }

    public String getIDPRODUCTOP() {
        return IDPRODUCTOP;
    }

    public void setIDPRODUCTOP(String IDPRODUCTOP) {
        this.IDPRODUCTOP = IDPRODUCTOP;
    }

    public String getIDCATEGORIAP() {
        return IDCATEGORIAP;
    }

    public void setIDCATEGORIAP(String IDCATEGORIAP) {
        this.IDCATEGORIAP = IDCATEGORIAP;
    }

    public String getNAMEPRODP() {
        return NAMEPRODP;
    }

    public void setNAMEPRODP(String NAMEPRODP) {
        this.NAMEPRODP = NAMEPRODP;
    }

    public String getPRECIOP() {
        return PRECIOP;
    }

    public void setPRECIOP(String PRECIOP) {
        this.PRECIOP = PRECIOP;
    }

    public String getSTOCKP() {
        return STOCKP;
    }

    public void setSTOCKP(String STOCKP) {
        this.STOCKP = STOCKP;
    }

    public Blob getRLP() {
        return RLP;
    }

    public void setRLP(Blob RLP) {
        this.RLP = RLP;
    }

    public void setRLP(FileInputStream fis, int longitudBytes) {
            this.RLP = RLP;
    }

     

    
    
    
}
