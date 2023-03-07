package TareaParcial2.ej7;

public class personaldelbanco implements ipersonaldelbanco {

    @Override
    public void pago(double porcentaje) {
        cajeros ty = new cajeros();
        director ty4 = new director();
        gerentegeneral ty3 = new gerentegeneral();
        agentedebanca ty2= new agentedebanca();

        this.setTy(ty);
        ty.setTy(ty2);
        ty2.setTy(ty3);
        ty3.setTy(ty4);
        this.ty.pago(porcentaje);
    }
    private ipersonaldelbanco ty;
    @Override
    public void setPorcentaje(double porcentaje) {

    }
    @Override
    public void setTy(ipersonaldelbanco ty) {
        this.ty = ty;
    }

    @Override
    public ipersonaldelbanco next() {
        return ty;
    }


}
