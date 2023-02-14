package Singletone.homeexersice;

public class Cuenta {
    public int dinero;
    private static Cuenta instance = null;

    private Cuenta() {
        dinero = 20000;
    }

    private synchronized static void multiThreadManage() {
        if (instance == null) {
            instance = new Cuenta();
        }
    }

    public static Cuenta getInstance() {
        if (instance == null) {
            multiThreadManage();
        }
        return instance;
    }

    public synchronized void guardarCosas(int dolar, int euro) {
        valorMonetario.getInstance().cambiarDolarABs(dolar);
        valorMonetario.getInstance().cambiarEuroABs(euro);
    }
}
