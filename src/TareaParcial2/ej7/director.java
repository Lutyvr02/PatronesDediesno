package TareaParcial2.ej7;

public class director implements ipersonaldelbanco {
    private ipersonaldelbanco ty;
    private double porcentaje;

    @Override
    public void setTy(ipersonaldelbanco ty) {
        this.ty = ty;
    }

    @Override
    public ipersonaldelbanco next() {
        return ty;
    }



    public double getPorcentaje() {
        return porcentaje;
    }

    @Override
    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    @Override
    public void pago(double porcentaje) {
        System.out.println("#ENCARGADO DE PRESTAMOS");
        System.out.println(porcentaje * 100 + "% Pagado");
        if (porcentaje >= 1) {
            System.out.println("El encargado de prestamos de prestamos le devuelve todos sus documentos");

        } else {
            System.out.println("El encargado de prestamos no puede hacerse cargo de este pago");
            this.ty.pago(porcentaje);
        }
    }
}