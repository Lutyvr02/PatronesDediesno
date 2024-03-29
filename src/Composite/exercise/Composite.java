package Composite.exercise;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private int total;
    private final List<Component> componentList = new ArrayList<>();
    public Composite(int precio) {
        super(precio);
    }

    @Override
    public void operacion() {
        for(Component component:componentList){
            component.operacion();
            setPrecio(total+=component.getPrecio());
        }
        System.out.println("El precio total de las computadoras sera de: "+getPrecio()+" dolares");
    }

    @Override
    public void add(Component component) {
        componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        componentList.remove(component);
    }

    @Override
    public Component get(int posi) {
        if (posi > componentList.size()) {
            System.out.println("No hay leaf en esta posicion");
        } else {
            return componentList.get(posi);
        }
        return null;
    }
}
