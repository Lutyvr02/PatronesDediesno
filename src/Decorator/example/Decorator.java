package Decorator.example;

public class Decorator implements Component{

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operacion() {
        System.out.println("ytytyt del decorator");
    }
}
