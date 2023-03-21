package TareaParcial3.ej3;

public class archivoleaf extends Component {
    public archivoleaf(int CantidadDePalabras) {
        super(CantidadDePalabras);
    }
    @Override
    public void operacion() {
        System.out.println("La cantidad de palabras son: "+ getCantidadDePalabras()+", en el archivo");
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
