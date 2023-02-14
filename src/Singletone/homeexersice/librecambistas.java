package Singletone.homeexersice;

public class librecambistas {
    private int dinero;

    public librecambistas(int dinero) {
        this.dinero = dinero;
    }

    public void dolarabs() {
        valorMonetario.getInstance().cambiarDolarABs(dinero);
    }

    public void euroabs() {
        valorMonetario.getInstance().cambiarEuroABs(dinero);
    }

    public void bsadolar() {
        valorMonetario.getInstance().cambiarBsADolar(dinero);
    }

    public void bsaeuro() {
        valorMonetario.getInstance().cambiarBsAEuro(dinero);
    }

    public void euroadolar() {
        valorMonetario.getInstance().cambiarEuroADolar(dinero);
    }

    public void dolaraeuro() {
        valorMonetario.getInstance().cambiarDolarAEuro(dinero);
    }
}
