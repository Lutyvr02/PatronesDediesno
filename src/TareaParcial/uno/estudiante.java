package TareaParcial.uno;

public class estudiante {

    private String nombre;
    private cajero caj;
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public cajero getCajero() {
        return caj;
    }

    public void setCajero(cajero caj) {
        this.caj = caj;
    }

    public void login(cajero caj) {
        System.out.println(caj.getCodigo());
        System.out.println("Buenos dias: "+caj.getName());
    }



    public estudiante(String nombre, cajero caj) {
        login(caj);
        this.nombre = nombre;
        this.caj = caj;
    }

    public String getNombre() {
        return nombre;
    }


    public void pagar(int monto) {
        System.out.println("Se pago a nombre de: " +nombre+" la cantidad de: "+monto);
        Pagar.getInstance().Pago(monto);
    }

}
