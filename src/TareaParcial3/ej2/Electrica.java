package TareaParcial3.ej2;

public class Electrica implements Servicio {
    private int precio = 100;
    MetodoDePago met;
    public Electrica(MetodoDePago met) {
        this.met = met;
    }
    @Override
    public void AplicarDescuento() {
        System.out.println("El precio del servicio electrico es: "+precio);
        met.AplicarDescuento();
    }
}
