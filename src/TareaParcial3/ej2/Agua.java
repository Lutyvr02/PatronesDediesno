package TareaParcial3.ej2;

public class Agua implements Servicio {
    private int precio = 100;
    MetodoDePago met;
    public Agua(MetodoDePago met) {
        this.met = met;
    }
    @Override
    public void AplicarDescuento() {
        System.out.println("El precio del servicio de agua es: "+precio);
        met.AplicarDescuento();
    }
}
