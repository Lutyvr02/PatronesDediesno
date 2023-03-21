package TareaParcial3.ej3;

public abstract class Component {

    public int getCantidadDePalabras() {
        return CantidadDePalabras;
    }

    public void setCantidadDePalabras(int cantidadDePalabras) {
        this.CantidadDePalabras = cantidadDePalabras;
    }

    public Component(int CantidadDePalabras) {
        this.CantidadDePalabras = CantidadDePalabras;
    }

    private int CantidadDePalabras;

    public abstract void operacion();
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract Component get(int posi);
}
