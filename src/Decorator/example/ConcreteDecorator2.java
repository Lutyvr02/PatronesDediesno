package Decorator.example;

public class ConcreteDecorator2 extends Decorator{

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
    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void operacion() {
        System.out.println("nueva funcion tyty concrete decorator2");
    }
}
