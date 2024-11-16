 
package MODELO;

/**
 *
 * @author kimbe
 */
public class DETALLE_VENTA {
        String IDDATALLED; 
        String IDPRODUCTOD; 
        String IDSERIALD; 
        int CANTIDADD; 
        double SUBTOTALD; 
        double IGVD; 
        double TOTALD; 
        String Extra ; 

    public DETALLE_VENTA() {
    }

    public DETALLE_VENTA(String IDDATALLED, String IDPRODUCTOD, String IDSERIALD, int CANTIDADD, double SUBTOTALD, double IGVD, double TOTALD, String Extra) {
        this.IDDATALLED = IDDATALLED;
        this.IDPRODUCTOD = IDPRODUCTOD;
        this.IDSERIALD = IDSERIALD;
        this.CANTIDADD = CANTIDADD;
        this.SUBTOTALD = SUBTOTALD;
        this.IGVD = IGVD;
        this.TOTALD = TOTALD;
        this.Extra = Extra;
    }

    public String getIDDATALLED() {
        return IDDATALLED;
    }

    public void setIDDATALLED(String IDDATALLED) {
        this.IDDATALLED = IDDATALLED;
    }

    public String getIDPRODUCTOD() {
        return IDPRODUCTOD;
    }

    public void setIDPRODUCTOD(String IDPRODUCTOD) {
        this.IDPRODUCTOD = IDPRODUCTOD;
    }

    public String getIDSERIALD() {
        return IDSERIALD;
    }

    public void setIDSERIALD(String IDSERIALD) {
        this.IDSERIALD = IDSERIALD;
    }

    public int getCANTIDADD() {
        return CANTIDADD;
    }

    public void setCANTIDADD(int CANTIDADD) {
        this.CANTIDADD = CANTIDADD;
    }

    public double getSUBTOTALD() {
        return SUBTOTALD;
    }

    public void setSUBTOTALD(double SUBTOTALD) {
        this.SUBTOTALD = SUBTOTALD;
    }

    public double getIGVD() {
        return IGVD;
    }

    public void setIGVD(double IGVD) {
        this.IGVD = IGVD;
    }

    public double getTOTALD() {
        return TOTALD;
    }

    public void setTOTALD(double TOTALD) {
        this.TOTALD = TOTALD;
    }

    public String getExtra() {
        return Extra;
    }

    public void setExtra(String Extra) {
        this.Extra = Extra;
    }
 
 
 
}
