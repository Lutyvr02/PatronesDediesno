package Composite.example;

import java.util.ArrayList;
import java.util.List;

public class Composite1 extends Component{
    private List<Component>componentList =new ArrayList<>();
    public Composite1(String atri1, String atri2) {
        super(atri1, atri2);
    }

    @Override
    public void operacion() {
        for(Component component:componentList){
            component.operacion();
        }
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
