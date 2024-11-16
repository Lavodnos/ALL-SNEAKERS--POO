 
package MODELO;

/**
 *
 * @author kimbe
 */
public class CATEGORIA {
    String IDCATEGORIAC;
    String NAMEC;
    String Descripcion_CtgC;

    public CATEGORIA() {
    }

    public CATEGORIA(String IDCATEGORIAC, String NAMEC, String Descripcion_CtgC) {
        this.IDCATEGORIAC = IDCATEGORIAC;
        this.NAMEC = NAMEC;
        this.Descripcion_CtgC = Descripcion_CtgC;
    }

    public String getIDCATEGORIAC() {
        return IDCATEGORIAC;
    }

    public void setIDCATEGORIAC(String IDCATEGORIAC) {
        this.IDCATEGORIAC = IDCATEGORIAC;
    }

    public String getNAMEC() {
        return NAMEC;
    }

    public void setNAMEC(String NAMEC) {
        this.NAMEC = NAMEC;
    }

    public String getDescripcion_CtgC() {
        return Descripcion_CtgC;
    }

    public void setDescripcion_CtgC(String Descripcion_CtgC) {
        this.Descripcion_CtgC = Descripcion_CtgC;
    }
    
    
}
