package Decorator.exercise;
public class mejoragps extends Decorator{
    public String getTy() {
        return ty;
    }

    public void setTy(String ty) {
        this.ty = ty;
    }

    public String getTyty() {
        return tyty;
    }

    public void setTyty(String tyty) {
        this.tyty = tyty;
    }

    private String ty;
    private String tyty;
    public mejoragps(Auto auto) {
        super(auto);
    }

    @Override
    public void avanzar() {
        System.out.println("A este auto se le puede conocer la ubicacion");
    }
}
