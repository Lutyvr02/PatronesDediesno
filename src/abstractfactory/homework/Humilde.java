package abstractfactory.homework;

public class Humilde extends Pasaje{
    private int numeroVuelo;
    private int numeroAsiento;
    private int costoPasaje;
    private int descuento;
    private String motivoDescuento;
    private Aviones avion = new Aviones("Nedforce 69", "200 pasajeros", "Airbus 300", "170 asientos");
    private Pasajeros pasajero = new Pasajeros("Ema",9641944);
    private Destinoviaje destino = new Destinoviaje("Bolivia", "Santa Cruz", "Viru Viru");
    private Origenviaje origen = new Origenviaje("Bolivia","La Paz", "Aeropuerto Internacional El Alto");

    public Humilde() {}

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public int getCostoPasaje() {
        return costoPasaje;
    }

    public void setCostoPasaje(int costoPasaje) {
        this.costoPasaje = costoPasaje;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public String getMotivoDescuento() {
        return motivoDescuento;
    }

    public void setMotivoDescuento(String motivoDescuento) {
        this.motivoDescuento = motivoDescuento;
    }

    public Aviones getAvion() {
        return avion;
    }

    public void setAvion(Aviones avion) {
        this.avion = avion;
    }

    public Pasajeros getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajeros pasajero) {
        this.pasajero = pasajero;
    }

    public Destinoviaje getDestino() {
        return destino;
    }

    public void setDestino(Destinoviaje destino) {
        this.destino = destino;
    }

    public Origenviaje getOrigen() {
        return origen;
    }

    public void setOrigen(Origenviaje origen) {
        this.origen = origen;
    }

    @Override
    public void showInfoPasaje() {
        System.out.println("**************************************************");
        System.out.println(" ");
        System.out.println("Mostrando Informacion del Pasaje Solidario:");
        System.out.println("Número de vuelo: " + getNumeroVuelo());
        System.out.println("Número de asiento: " + getNumeroAsiento());
        System.out.println("Costo de pasaje: " + getCostoPasaje());
        System.out.println("Decuento: " + getDescuento());
        System.out.println("Motivo del descuento: " + getMotivoDescuento());
        avion.showInfoAvion();
        pasajero.showInfoPasajero();
        destino.showInfoDestino();
        origen.showInfoOrigen();
        System.out.println(" ");
    }
}
