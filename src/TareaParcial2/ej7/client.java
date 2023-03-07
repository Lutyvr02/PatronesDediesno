package TareaParcial2.ej7;

public class client {
    public static void main(String[] args) {
        personaldelbanco ty = new personaldelbanco();
        persona dffasfas = new persona("Carlos");
        prestarse pre = new prestarse();
        dffasfas.pedirPrestamo(34245142, pre,ty);
        dffasfas.pagar(5432413);
        dffasfas.pagar(13212321);
        dffasfas.pagar(632452532);
        dffasfas.pagar(41341241);

    }
}
