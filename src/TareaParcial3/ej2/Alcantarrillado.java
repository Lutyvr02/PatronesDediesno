package TareaParcial3.ej2;

public class Alcantarrillado implements Servicio {
    private int precio = 100;
    MetodoDePago met;
    public Alcantarrillado(MetodoDePago met) {
        this.met = met;
    }
    @Override
    public void AplicarDescuento() {
        System.out.println("El precio del servicio de alcantarrillado es: "+precio);
        met.AplicarDescuento();
    }
}
