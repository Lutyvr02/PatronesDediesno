package TareaParcial3.ej3;
//(Composite) Se tiene un archivo como objeto base, un conjunto de archivos se los
//guarda en folders y varios folders se lo guardan en una unidad de disco, Lo que
//podemos obtener de un archivo es el número de palabras que tiene el archivo.
//Debemos de obtener el número de palabras que hay en un folder y en una unidad de
//disco.
public class Client {
    public static void main(String[] args) {
        archivoleaf ty = new archivoleaf(123);
        archivoleaf ty1 = new archivoleaf(123);
        archivoleaf ty2 = new archivoleaf(123);
        archivoleaf ty3 = new archivoleaf(123);
        archivoleaf ty4 = new archivoleaf(123);
        archivoleaf ty5 = new archivoleaf(123);
        archivoleaf ty6 = new archivoleaf(123);
        archivoleaf ty7 = new archivoleaf(123);
        archivoleaf ty8 = new archivoleaf(123);
        archivoleaf ty9 = new archivoleaf(123);

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
