package TareaParcial2.ej3;

public class celu {
    private String modelo;
    private String marca;
    private String gama;
    private int precio;
    private String strategy;

    public celu(String modelo, String marca, String gama, int precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.gama = gama;
        this.precio = precio;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
