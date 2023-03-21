package TareaParcial3.ej1;

public class Pociones extends Decorator {
    public Pociones(Armas armas) {
        super(armas);
    }

    @Override
    public void mejoras() {
        super.mejoras();
        System.out.println();
        System.out.println("El nombre de este personaje es: Luciano");
        System.out.println("Su nivel es: 1");
        System.out.println("Sus objetos equipados son: Pociones");
        System.out.println("Su porcentaje de armadura es: 1%");
        System.out.println("Sus Puntos de ataque son: 1%");
        System.out.println("Sus puntos de armadura son: 1%");
        System.out.println("Sus puntos de regenracion son: 80%");

    }
}
