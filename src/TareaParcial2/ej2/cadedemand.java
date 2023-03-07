package TareaParcial2.ej2;

public class cadedemand implements iejerc {
    private iejerc sig;
    @Override
    public void setSig(iejerc ejercito) {
        sig = ejercito;
    }
    @Override
    public void orden(ordenes ty) {
        cabo ca = new cabo();
        coronel cor = new coronel();
        teniente te = new teniente();
        general gen = new general();

        this.setSig(sig);
        ca.setSig(ca);
        cor.setSig(cor);
        te.setSig(gen);

        this.sig.orden(ty);
    }

    @Override
    public iejerc next() {
        return sig;
    }


}
