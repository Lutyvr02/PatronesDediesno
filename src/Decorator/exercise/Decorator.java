package Decorator.exercise;

public class Decorator implements Auto{

    private Auto auto;

    public Decorator(Auto auto) {
        this.auto = auto;
    }
    @Override
    public void avanzar() {
        System.out.println("Añadiendo mejoras......");

    }
}
