package TareaParcial.diez;

public class transpor {
    private static String placa;
    private static String modelo;

    public transpor(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public static void info() {
        System.out.println("AUTOMOVIL:");
        System.out.println("Placa: "+placa);
        System.out.println("Modelo: "+modelo);
    }

}
