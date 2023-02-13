package FactoryMethod.example;

public class Concretecreator2 extends Creator {
    @Override
    public ConcreteProduct2 factoryMethod() {
        ConcreteProduct2 p2 = new ConcreteProduct2();
        /*
         *
         * toda la logica de creacion del concrete product1
         *
         * */
        return p2;
    }
}