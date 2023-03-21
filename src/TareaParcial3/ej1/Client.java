package TareaParcial3.ej1;

public class Client {
    public static void main(String[] args) {
        Armas pe = new Personaje();
        pe.mejoras();
        pe = new Escudo(pe);
        pe.mejoras();
        pe = new Escopetas(pe);
        pe.mejoras();
        pe = new Pociones(pe);
        pe.mejoras();

    }
}