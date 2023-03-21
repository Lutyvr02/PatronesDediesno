package TareaParcial3.ej1;
//su puntos de ataque suben en un 30% y
//su nivel se incrementa al doble
public class Espadas extends Decorator {
    public Espadas(Armas armas) {
        super(armas);
    }

    @Override
    public void mejoras() {
        super.mejoras();
        System.out.println();
        System.out.println("El nombre de este personaje es: Luciano");
        System.out.println("Su nivel es: 2");
        System.out.println("Sus armas equipadas son: Espada");
        System.out.println("Su porcentaje de armadura es: 1%");
        System.out.println("Sus Puntos de ataque son: 30%");
        System.out.println("Sus puntos de armadura son: 1%");
        System.out.println("Sus puntos de regenracion son: 1%");
    }
}
