package TareaParcial2.ej7;

public interface ipersonaldelbanco  {

    void setTy(ipersonaldelbanco siguiente);
    ipersonaldelbanco next();
    void pago(double porcentaje);
    void setPorcentaje(double porcentaje);
}
