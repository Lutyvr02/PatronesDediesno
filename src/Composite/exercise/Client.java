package Composite.exercise;
//lo denomina laboratorio de cuenta con
//más de 2 computadoras, cuando se tienen un conjunto de laboratorios se lo llama
//contenedores de computadoras. cuando se crean estos se requiere saber el precio total de cada 1 de ellos.
public class Client {
    public static void main(String[] args) {
        Computadoraleaf ty = new Computadoraleaf(100);
        Computadoraleaf ty1 = new Computadoraleaf(100);
        Computadoraleaf ty2 = new Computadoraleaf(100);
        Computadoraleaf ty3 = new Computadoraleaf(100);
        Computadoraleaf ty4 = new Computadoraleaf(100);
        Computadoraleaf ty5 = new Computadoraleaf(100);
        Computadoraleaf ty6 = new Computadoraleaf(100);
        Computadoraleaf ty7 = new Computadoraleaf(100);
        Computadoraleaf ty8 = new Computadoraleaf(100);
        Computadoraleaf ty9 = new Computadoraleaf(100);

        Composite labo = new Composite(0);
        labo.add(ty);
        labo.add(ty1);

        Composite labo2 = new Composite(0);
        labo2.add(ty2);
        labo2.add(ty3);
        labo2.add(ty4);

        Composite labo3 = new Composite(0);
        labo3.add(ty5);
        labo3.add(ty6);
        labo3.add(ty7);
        labo3.add(ty8);
        labo3.add(ty9);

        System.out.println("Contenedor de computadoras");
        Composite contenedor = new Composite(0);
        contenedor.add(labo);
        contenedor.add(labo2);
        contenedor.add(labo3);

        contenedor.operacion();

    }
}
