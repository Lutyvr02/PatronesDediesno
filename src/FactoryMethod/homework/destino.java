package FactoryMethod.homework;

public class destino {
    private String pais;
    private String ciudad;
    private String aeropuerto;

    public void setAeropuerto(String aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getAeropuerto() {
        return aeropuerto;
    }

    public void showAlgo() {
        System.out.println("Hasta:");
        System.out.println("Origen(pais): "+pais+" Ciudad: "+ciudad+" Aeropuerto: "+aeropuerto);
    }
}
