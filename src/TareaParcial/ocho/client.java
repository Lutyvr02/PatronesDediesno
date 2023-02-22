package TareaParcial.ocho;

public class client {
    public static void main(String[] args) {
        caja c1 = new caja(new prestar("compra de Casa"));
        caja c2 = new caja(new prestar("compra de celular"));
        caja c3 = new caja(new prestar("pago de impuestos"));
        caja c4 = new caja(new prestar("pago de viaje"));

        c1.prestamoDinero(32131232130.123123123);
        c2.prestamoDinero(123123123131312312312312.13123123);
        c4.prestamoDinero(874532543.98746);
        c3.prestamoDinero(1632453142.0564532413);

    }
}
