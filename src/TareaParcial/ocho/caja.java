package TareaParcial.ocho;

public class caja {
    prestar ty;

    public caja(prestar pre) {
        this.ty = pre;
    }

    public void prestamoDinero(double monto) {
        System.out.println("Se realizo el prestamo de Tipo "+ ty.getTipo()+" por el monto de: "+monto+" Bs");
        principal.getInstance().retiroDinero(monto);
    }


}
