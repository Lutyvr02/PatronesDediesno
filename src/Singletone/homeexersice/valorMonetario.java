package Singletone.homeexersice;

public class valorMonetario {
    private static valorMonetario instance = null;

    private valorMonetario() {
    }

    private synchronized static void multiThreadManage() {
        if (instance == null) {
            instance = new valorMonetario();
        }
    }

    public static valorMonetario getInstance() {
        if (instance == null) {
            multiThreadManage();
        }
        return instance;
    }

    public synchronized void cambiarDolarABs(int dinero) {
        System.out.println("El cambio de dolar a Bs es: " + dinero * 7);
    }

    public synchronized void cambiarBsADolar(int dinero) {
        System.out.println("El cambio de Bs a Dolar es: " + dinero / 7);
    }

    public synchronized void cambiarBsAEuro(int dinero) {
        System.out.println("El cambio de Bs a Euro es: " + dinero / 8);
    }

    public synchronized void cambiarEuroABs(int dinero) {
        System.out.println("El cambio de Euro a Bs es: " + dinero * 8);
    }

    public synchronized void cambiarEuroADolar(int dinero) {
        System.out.println("El cambio de Euro a Dolar es: " + dinero / 1.07);
    }

    public synchronized void cambiarDolarAEuro(int dinero) {
        System.out.println("El cambio de Dolar a Euro es: " + dinero * 1.07);
    }
}
