package state;

public class procesador {
    private String nombreCPU;
    private double consumo;

    public procesador(String nombreCPU) {
        this.nombreCPU = nombreCPU;
    }

    public String getNombreCPU() {
        return nombreCPU;
    }

    public void setNombreCPU(String nombreCPU) {
        this.nombreCPU = nombreCPU;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
    public void showInfo() {
        System.out.println("cpu: ");
        System.out.println("Nombre: "+nombreCPU);
        System.out.println("Consumo: "+ consumo);
    }
}
