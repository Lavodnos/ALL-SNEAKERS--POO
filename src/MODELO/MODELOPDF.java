 
package MODELO;

/**
 *
 * @author kimbe
 */
public class MODELOPDF {
    String CLIENTEE;
    String CAJEROO;
    String PRODUCTOO;
    String CANTIDADD;
    String SUBTOTALL;
    String IGVV;
    String TOTALL;
    String FECHAA;

    public MODELOPDF() {
    }

    public MODELOPDF(String CLIENTEE, String CAJEROO, String PRODUCTOO, String CANTIDADD, String SUBTOTALL, String IGVV, String TOTALL, String FECHAA) {
        this.CLIENTEE = CLIENTEE;
        this.CAJEROO = CAJEROO;
        this.PRODUCTOO = PRODUCTOO;
        this.CANTIDADD = CANTIDADD;
        this.SUBTOTALL = SUBTOTALL;
        this.IGVV = IGVV;
        this.TOTALL = TOTALL;
        this.FECHAA = FECHAA;
    }

    public String getCLIENTEE() {
        return CLIENTEE;
    }

    public void setCLIENTEE(String CLIENTEE) {
        this.CLIENTEE = CLIENTEE;
    }

    public String getCAJEROO() {
        return CAJEROO;
    }

    public void setCAJEROO(String CAJEROO) {
        this.CAJEROO = CAJEROO;
    }

    public String getPRODUCTOO() {
        return PRODUCTOO;
    }

    public void setPRODUCTOO(String PRODUCTOO) {
        this.PRODUCTOO = PRODUCTOO;
    }

    public String getCANTIDADD() {
        return CANTIDADD;
    }

    public void setCANTIDADD(String CANTIDADD) {
        this.CANTIDADD = CANTIDADD;
    }

    public String getSUBTOTALL() {
        return SUBTOTALL;
    }

    public void setSUBTOTALL(String SUBTOTALL) {
        this.SUBTOTALL = SUBTOTALL;
    }

    public String getIGVV() {
        return IGVV;
    }

    public void setIGVV(String IGVV) {
        this.IGVV = IGVV;
    }

    public String getTOTALL() {
        return TOTALL;
    }

    public void setTOTALL(String TOTALL) {
        this.TOTALL = TOTALL;
    }

    public String getFECHAA() {
        return FECHAA;
    }

    public void setFECHAA(String FECHAA) {
        this.FECHAA = FECHAA;
    }
    
}
