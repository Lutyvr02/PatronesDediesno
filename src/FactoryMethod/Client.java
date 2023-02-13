package FactoryMethod;

public class Client {
    public static void main(String[] ars) {
        IProduct prod1 = new Concretecreator1().factoryMethod();
        prod1.create();

        IProduct prod2 = new Concretecreator2().factoryMethod();
        prod2.create();
    }
}