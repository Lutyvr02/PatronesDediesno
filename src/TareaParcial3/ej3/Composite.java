package TareaParcial3.ej3;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private int total;
    private final List<Component> componentList = new ArrayList<>();
    public Composite(int CantidadDePalabras) {
        super(CantidadDePalabras);
    }

    @Override
    public void operacion() {
        for(Component component:componentList){
            component.operacion();
            setCantidadDePalabras(total+=component.getCantidadDePalabras());
        }

        System.out.println("La cantidad de palabras totales es: "+ getCantidadDePalabras());
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
