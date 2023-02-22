package TareaParcial.ocho;

public class principal {





    public void saldoActual(){
        System.out.println("Tu saldo es: "+saldo);
    }


    private synchronized static void create(){
        if (instance == null)
            instance = new principal();
    }

    public static principal getInstance(){
        if (instance == null)
            create();
        return instance;
    }
    private static principal instance = null;
    private double saldo;

    public principal() {
        saldo = 10000.00;
        System.out.println("Tu saldo inicial es: "+saldo+" Bs");
    }
    public synchronized void retiroDinero(double amount){
        if (amount <= saldo){
            saldo=saldo-amount;
            System.out.println("Se retito: "+amount+" Bs de maneta exitosa");
            saldoActual();
        }else{
            System.out.println("No se pudo retirar la cantidad de: "+amount+", es mayor al saldo actual");
        }
    }

}
