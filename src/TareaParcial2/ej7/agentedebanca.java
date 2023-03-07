package TareaParcial2.ej7;

public class agentedebanca implements ipersonaldelbanco {
    private ipersonaldelbanco ty;
    private double porcentaje;

    @Override
    public void setTy(ipersonaldelbanco ty) {
        this.ty = ty;
    }

    @Override
    public ipersonaldelbanco next() {
        return ty;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    @Override
    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    @Override
    public void pago(double porcentaje) {
        System.out.println("el agente de credito");
        System.out.println("Se pago el: "+porcentaje * 100 + "%");
        if (porcentaje >= 0.26 && porcentaje <= 0.50) {
            System.out.println("el agente registro el pago y se da la oportunidad de refinanciar todo");
        } else {
            System.out.println("el agente es incapaz de refinanciar");
            this.ty.pago(porcentaje);
        }
    }

}