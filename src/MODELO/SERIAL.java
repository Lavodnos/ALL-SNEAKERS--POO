
package MODELO;

/**
 *
 * @author kimbe
 */
public class SERIAL {
    String IDSERIALS;
    String IDCLIENTES;
    String IDUSERS;
    String FECHAS;

    public SERIAL() {
    }

    public SERIAL(String IDSERIALS, String IDCLIENTES, String IDUSERS, String FECHAS) {
        this.IDSERIALS = IDSERIALS;
        this.IDCLIENTES = IDCLIENTES;
        this.IDUSERS = IDUSERS;
        this.FECHAS = FECHAS;
    }

    public String getIDSERIALS() {
        return IDSERIALS;
    }

    public void setIDSERIALS(String IDSERIALS) {
        this.IDSERIALS = IDSERIALS;
    }

    public String getIDCLIENTES() {
        return IDCLIENTES;
    }

    public void setIDCLIENTES(String IDCLIENTES) {
        this.IDCLIENTES = IDCLIENTES;
    }

    public String getIDUSERS() {
        return IDUSERS;
    }

    public void setIDUSERS(String IDUSERS) {
        this.IDUSERS = IDUSERS;
    }

    public String getFECHAS() {
        return FECHAS;
    }

    public void setFECHAS(String FECHAS) {
        this.FECHAS = FECHAS;
    }




}



