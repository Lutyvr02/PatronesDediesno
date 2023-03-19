package Decorator.exercise;

public class taxi implements Auto{
    @Override
    public void avanzar() {
        System.out.println("El taxi arranca");
    }
}
