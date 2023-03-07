package TareaParcial2.ej2;

public class ordenes {
    String type;
    String descp;

    public ordenes(String tipo, String descripcion) {
        this.type = tipo;
        this.descp = descripcion;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescp() {
        return descp;
    }

    public void setDescp(String descp) {
        this.descp = descp;
    }
    public void showInfo(){
        System.out.println("Orden: ");
        System.out.println("TIPO: "+ type);
        System.out.println("Descrip: "+ descp);
    }
}
