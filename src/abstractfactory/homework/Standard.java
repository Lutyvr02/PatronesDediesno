package abstractfactory.homework;

public class Standard extends Pasaje{
    private int numeroVuelo;
    private int numeroAsiento;
    private int costoPasaje;
    private Aviones avion = new Aviones("Nedforce 69", "200 pasajeros", "Airbus 300", "170 asientos");
    private Pasajeros pasajero = new Pasajeros("Ema",9641944);
    private Destinoviaje destino = new Destinoviaje("Bolivia", "Santa Cruz", "Viru Viru");
    private Origenviaje origen = new Origenviaje("Bolivia","La Paz", "Aeropuerto Internacional El Alto");

    public Standard() {
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public Destinoviaje getDestino() {
        return destino;
    }

    public void setDestino(Destinoviaje dest) {
        this.destino = dest;
    }

    public Origenviaje getOrigen() {
        return origen;
    }

    public void setOrigen(Origenviaje origen) {
        this.origen = origen;
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

    @Override
    public void showInfoPasaje() {
        System.out.println("**************************************************");
        System.out.println(" ");
        System.out.println("Mostrando Informacion del Pasaje Standard:");
        System.out.println("Número de vuelo: " + getNumeroVuelo());
        System.out.println("Número de asiento: " + getNumeroAsiento());
        System.out.println("Costo de pasaje: " + getCostoPasaje());
        avion.showInfoAvion();
        pasajero.showInfoPasajero();
        destino.showInfoDestino();
        origen.showInfoOrigen();
        System.out.println(" ");
    }

}
