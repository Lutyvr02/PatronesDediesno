package abstractfactory.homework;

public class Destinoviaje {
    private String pais;
    private String ciudad;
    private String aeropuerto;

    public Destinoviaje(String pais, String ciudad, String aeropuerto) {
        this.pais = pais;
        this.ciudad = ciudad;
        this.aeropuerto = aeropuerto;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getAeropuerto() {
        return aeropuerto;
    }

    public void setAeropuerto(String aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    public void showInfoDestino() {
        System.out.println("Pais: " + getPais());
        System.out.println("Ciudad: " + getCiudad());
        System.out.println("Aeropuerto: " + getAeropuerto());
    }
}
