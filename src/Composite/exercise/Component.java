package Composite.exercise;

public abstract class Component {

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    public Component(int precio) {
        Precio = precio;
    }

    private int Precio;


    public abstract void operacion();
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract Component get(int posi);
}
