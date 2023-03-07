package TareaParcial2.ej7;

public class persona {
    private String nombre;
    private int dinero;
    private ipersonaldelbanco ty;
    private prestarse pres;

    public void pagar(int dinero){
        pres.setDeposito(dinero);
        double deposito = pres.getDeposito();
        double porcentaje = deposito/ pres.getTotal();
        ty.setPorcentaje(porcentaje);
        ty.pago(porcentaje);
    }
    public void pedirPrestamo(int total, prestarse pres, personaldelbanco personal){
        this.pres =pres;
        this.pres.setTotal(total);
        this.ty =personal;
        this.ty.setPorcentaje((double) pres.getDeposito()/pres.getTotal());
    }

    public persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }


}
