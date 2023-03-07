package TareaParcial2.ej7;

public class gerentegeneral implements ipersonaldelbanco{
    private ipersonaldelbanco next;
    private double porcentaje;
    @Override
    public void setTy(ipersonaldelbanco next) {
        this.next = next;
    }

    @Override
    public ipersonaldelbanco next() {
        return next;
    }



    public double getPorcentaje() {
        return porcentaje;
    }

    @Override
    public void setPorcentaje(double porcentaje) {
        this.porcentaje=porcentaje;
    }

    @Override
    public void pago(double porcentaje) {
        System.out.println("Gerente general");
        System.out.println(porcentaje*100+ "% Pagado");
        if(porcentaje>=0.51 && porcentaje <= 0.99){
            System.out.println("el gerente registro el pago");
        }else{
            System.out.println("el gerente no puede hacerse cargo");
            this.next.pago(porcentaje);
        }
    }
}
