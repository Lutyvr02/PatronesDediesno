package Decorator.exercise;

public class Client {
    public static void main(String[] args) {
        System.out.println();
        Auto mini = new minibus();
        mini.avanzar();
        mini = new mejoraturbo(mini);
        mini.avanzar();
        mini = new mejoragps(mini);
        mini.avanzar();
        mini = new mejoragas(mini);
        mini.avanzar();

        System.out.println();

        Auto taxi = new taxi();
        taxi.avanzar();
        taxi = new mejoraturbo(mini);
        taxi.avanzar();

        System.out.println();

        Auto vago = new vagonetas();
        vago.avanzar();
        vago = new mejoragas(mini);
        vago.avanzar();
        vago = new mejoragps(mini);
        vago.avanzar();
    }
}