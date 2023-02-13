package FactoryMethod.homework;

public class Mostrar {
    public static void main(String[] args) {

        Humilde hu1 = (Humilde) new Humildercreator().create();
        Humilde hu2 = (Humilde) new Humildercreator().create();

        Standard st1 = (Standard) new Standarcreator().create();
        Standard st2 = (Standard) new Standarcreator().create();

        Infante I1 = (Infante) new InfanterCreator().create();
        Infante I2 = (Infante) new InfanterCreator().create();

        hu1.showAlgo();
        hu2.showAlgo();
        st1.showAlgo();
        st2.showAlgo();
        I1.showAlgo();
        I2.showAlgo();


    }


}

