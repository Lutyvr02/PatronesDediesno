package TareaParcial.uno;

public class Pagar {
    private static Pagar instance = null;
    private int dinero;



    public synchronized void Pago(int amount){
        dinero = dinero +amount;
        saldoActual();
    }

    public void saldoActual(){
        System.out.println("Tu saldo es: "+ dinero);
    }
    public Pagar() {
        dinero =0 ;
        System.out.println(">Saldo Inicial: "+ dinero);
    }

    private synchronized static void create(){
        if (instance == null)
            instance = new Pagar();
    }


    public static Pagar getInstance(){
        if (instance == null)
            create();
        return instance;
    }
}
