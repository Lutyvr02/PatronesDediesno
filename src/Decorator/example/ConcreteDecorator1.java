package Decorator.example;

public class ConcreteDecorator1 extends Decorator{

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
    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void operacion() {
        super.operacion();
        System.out.println("nueva funcion concrete decorator1");
    }
}
