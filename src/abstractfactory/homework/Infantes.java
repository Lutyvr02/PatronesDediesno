package abstractfactory.homework;

public class Infantes extends Pasaje {
    private int numeroVuelo;
    private int numeroAsiento;
    private int costoEspecial;
    private Aviones avion = new Aviones("Nedforce 69", "200 pasajeros", "Airbus 300", "170 asientos");
    private Pasajeros pasajero = new Pasajeros("Ema",9641944);
    private Destinoviaje destino = new Destinoviaje("Bolivia", "Santa Cruz", "Viru Viru");
    private Origenviaje origen = new Origenviaje("Bolivia","La Paz", "Aeropuerto Internacional El Alto");

    public Infantes() {}

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

    public int getCostoEspecial() {
        return costoEspecial;
    }

    public void setCostoEspecial(int costoEspecial) {
        this.costoEspecial = costoEspecial;
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
        System.out.println("Mostrando Informacion del Pasaje Infante:");
        System.out.println("Número de vuelo: " + getNumeroVuelo());
        System.out.println("Número de asiento: " + getNumeroAsiento());
        System.out.println("Costo especial: " + getCostoEspecial());
        avion.showInfoAvion();
        pasajero.showInfoPasajero();
        destino.showInfoDestino();
        origen.showInfoOrigen();
        System.out.println(" ");
    }
}
