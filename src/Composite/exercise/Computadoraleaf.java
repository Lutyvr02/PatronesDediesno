package Composite.exercise;

public class Computadoraleaf extends Component{


    public Computadoraleaf(int precio) {
        super(precio);
    }

    @Override
    public void operacion() {
        System.out.println("El precio de la computadora es: "+getPrecio()+" dolares");

    }

    @Override
    public void add(Component component) {
        System.out.println("No se puede añadir mas weas");
    }

    @Override
    public void remove(Component component) {
        System.out.println("No se puede añadir mas weas");
    }

    @Override
    public Component get(int posi) {
        System.out.println("No se puede añadir mas weas");
        return null;
    }
}
