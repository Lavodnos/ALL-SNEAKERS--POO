
package MODELO;

/**
 *
 * @author kimbe
 */
public class CLIENTE {
    String IDCLIENTEC;
    String DNICC;
    String NameC;

    public CLIENTE() {
    }

    public CLIENTE(String IDCLIENTEC, String DNICC, String NameC) {
        this.IDCLIENTEC = IDCLIENTEC;
        this.DNICC = DNICC;
        this.NameC = NameC;
    }

    public String getIDCLIENTEC() {
        return IDCLIENTEC;
    }

    public void setIDCLIENTEC(String IDCLIENTEC) {
        this.IDCLIENTEC = IDCLIENTEC;
    }

    public String getDNICC() {
        return DNICC;
    }

    public void setDNICC(String DNICC) {
        this.DNICC = DNICC;
    }

    public String getNameC() {
        return NameC;
    }

    public void setNameC(String NameC) {
        this.NameC = NameC;
    }
    
}
