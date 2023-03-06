package state;

public class client {
    public static void main(String[] args) {
        Compu pc = new Compu("Intel i5 11500k", "Lenovo DDR4");
        pc.showInfo();

        pc.changeState(new encendido());
        pc.showInfo();

        pc.changeState(new reinicio());
        pc.showInfo();

        pc.changeState(new apagado());
        pc.showInfo();
    }
}
