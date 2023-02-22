package TareaParcial.diez;

public class verificacion {
    transpor tra;

    public verificacion(transpor tra) {
        this.tra = tra;
    }

    public void pagar (int i) {
        transpor.info();
        System.out.println("Se pago la cantidad de: "+i+" Bs");
        sis.getInstance().pagar(i);
    }

}
