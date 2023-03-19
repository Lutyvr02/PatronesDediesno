package Decorator.example;

public class Client {
    public static void main(String[] args) {
        Component analisis = new ConcreteComponent();
        analisis.operacion();
        analisis = new ConcreteDecorator1(analisis);
        analisis.operacion();
        analisis = new ConcreteDecorator2(analisis);
        analisis.operacion();
    }
}
