 
package MODELO;
 /**
 *
 * @author kimbe
 */
public class USUARIO {
  public String IDUSERU;
  int ID_RolU;
  String USERU;
  String NAMEU;
  String PASSU;

    public USUARIO() {
    }

    public USUARIO(String IDUSERU, int ID_RolU, String USERU, String NAMEU, String PASSU) {
        this.IDUSERU = IDUSERU;
        this.ID_RolU = ID_RolU;
        this.USERU = USERU;
        this.NAMEU = NAMEU;
        this.PASSU = PASSU;
    }

    public String getIDUSERU() {
        return IDUSERU;
    }

    public void setIDUSERU(String IDUSERU) {
        this.IDUSERU = IDUSERU;
    }

    public int getID_RolU() {
        return ID_RolU;
    }

    public void setID_RolU(int ID_RolU) {
        this.ID_RolU = ID_RolU;
    }

    public String getUSERU() {
        return USERU;
    }

    public void setUSERU(String USERU) {
        this.USERU = USERU;
    }

    public String getNAMEU() {
        return NAMEU;
    }

    public void setNAMEU(String NAMEU) {
        this.NAMEU = NAMEU;
    }

    public String getPASSU() {
        return PASSU;
    }

    public void setPASSU(String PASSU) {
        this.PASSU = PASSU;
    }

   
}