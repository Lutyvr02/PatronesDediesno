package TareaParcial3.ej2;

public class Client {
    public static void main(String[] args){
        MetodoDePago Efecti = new Efectivo();
        MetodoDePago Banca = new Bancaria();
        Servicio electrico = new Electrica(Efecti);
        Servicio agua = new Agua(Banca);

        electrico.AplicarDescuento();
        agua.AplicarDescuento();
    }
}
