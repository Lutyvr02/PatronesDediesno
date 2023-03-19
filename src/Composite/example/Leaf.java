package Composite.example;

public class Leaf extends Component{


    public Leaf(String atri1, String atri2) {
        super(atri1, atri2);
    }

    @Override
    public void operacion() {
        System.out.println("El primer atributo es: "+getAtri1());
        System.out.println("El segundo atributo es: "+getAtri2());

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
