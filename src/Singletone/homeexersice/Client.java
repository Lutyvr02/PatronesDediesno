package Singletone.homeexersice;

public class Client {
    public static void main(String[] args) {

        System.out.println("Cambio de casa: ");
        Casadecambiodemoneda co = new Casadecambiodemoneda(8678678);
        co.bsadolar();
        co.bsaeuro();
        co.dolarabs();
        co.dolaraeuro();
        co.euroadolar();
        co.euroabs();

        System.out.println("Cambios del banco: ");
        Banco banco = new Banco(54656);
        banco.bsadolar();
        banco.bsaeuro();
        banco.dolarabs();
        banco.dolaraeuro();
        banco.euroadolar();
        banco.euroabs();

        System.out.println("Cambios librecambista: ");
        librecambistas la = new librecambistas(6456);
        la.bsadolar();
        la.bsaeuro();
        la.dolarabs();
        la.dolaraeuro();
        la.euroadolar();
        la.euroabs();

        System.out.println("Mostrando los cambios a bolivianos:");
        Cuenta.getInstance().guardarCosas(14123, 1312312);
    }
}
