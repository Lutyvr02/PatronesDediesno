package Composite.example;

public class Client {
    public static void main(String[] args) {
        Leaf ty = new Leaf("tyty","tyty");
        Leaf ty1 = new Leaf("tyty","tyty");
        Leaf ty2 = new Leaf("tyty","tyty");

        Composite1 tyty = new Composite1("tytytytyty","tytytyty");
        tyty.add(ty);
        tyty.add(ty1);
        tyty.add(ty2);

        Composite1 tytyty1 = new Composite1("tytytytyty","tytytyty");
        tyty.add(ty);
        tyty.add(ty1);
        tyty.add(ty2);

        Composite1 tytyty2 = new Composite1("tytyty","tytyty");
        tytyty2.add(tyty);
        tytyty2.add(tytyty1);

        tytyty2.operacion();
    }
}
