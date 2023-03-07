package TareaParcial2.ej7;

public class cajeros  implements ipersonaldelbanco {
    private ipersonaldelbanco next;
    private prestarse pre;
    private double porcentaje;

    @Override
    public void setTy(ipersonaldelbanco ty) {
        this.next = ty;
    }

    @Override
    public ipersonaldelbanco next() {
        return next;
    }


    public double getPorcentaje(prestarse pre) {
        this.pre = pre;
        return this.pre.porcentaje();
    }

    @Override
    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    @Override
    public void pago(double porcentaje) {
        System.out.println("de la parte de los cajero");
        System.out.println("Se pago el: "+porcentaje * 100 + "%");
        if (porcentaje >= 0 && porcentaje <= 0.25) {
            System.out.println("los cajeros registraron los pagos ");
        } else {
            System.out.println("El cajero no es capaz de hacerse cargo");
            this.next.pago(porcentaje);
        }
    }

}