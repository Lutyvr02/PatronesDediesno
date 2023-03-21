package TareaParcial3.ej1;

public abstract class Decorator implements Armas {
    private Armas armas;
    public Decorator(Armas armas) {
        this.armas = armas;
    }
    @Override
    public void mejoras() {
        System.out.println("Equipando objetos......");
    }
}
