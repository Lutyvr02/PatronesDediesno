package TareaParcial.diez;

public class sis {
    private synchronized static void create(){
        if (instance == null)
            instance = new sis();
    }

    public static sis getInstance(){
        if (instance == null)
            create();
        return instance;
    }

    public synchronized void pagar(int amount) {
        saldo = saldo+amount;
        saldoActual();
    }

    public void saldoActual(){
        System.out.println("Tu saldo actual es: "+saldo+" Bs.");
    }
    private static sis instance = null;
    private int saldo;

    public sis() {
        saldo=0;
        System.out.println("tu saldo al inicio es: "+saldo+" Bs");
    }


}
