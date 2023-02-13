package FactoryMethod.homework;
public class Base {

    private int numerovuelo;
    private int asiento;
    private int costo;
    public int getNumerovuelo(int i) {
        return numerovuelo;
    }

    public void setNumerovuelo(int numerovuelo) {
        this.numerovuelo = numerovuelo;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public int getcosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void showInfo(){
        System.out.println("Base > tipo:"+ asiento);
        System.out.println("Base > costo:"+costo);
    }
}