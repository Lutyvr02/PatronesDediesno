package abstractfactory.homework;

public class Aviones {
    private String marca;
    private String capacidad;
    private String modelo;
    private String numeroAsientos;

    public Aviones(String marca, String capacidad, String modelo, String numeroAsientos) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.modelo = modelo;
        this.numeroAsientos = numeroAsientos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(String numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public void showInfoAvion() {
        System.out.println("Marca-> " + getMarca());
        System.out.println("Capacidad-> " + getCapacidad());
        System.out.println("Modelo-> " + getModelo());
        System.out.println("Número de Asientos-> " + getNumeroAsientos());
    }
}
