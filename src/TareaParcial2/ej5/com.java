package TareaParcial2.ej5;

import java.util.ArrayList;
import java.util.List;

public class com {
    private List<String> lcod = new ArrayList<>();

    public void addCodigo(String codigo){
        lcod.add(codigo);
    }
    public void showInfo(){
        System.out.println("Nuevos cambios: ");
        for(String aux : lcod){
            System.out.println(aux);
        }
    }

    public List<String> getLcod(){
        List<String> list1 = new ArrayList<>();
        for(String i : lcod){
            list1.add(i);
        }
        return list1;
    }

    public void setLcod(List<String> lcod){
        this.lcod = lcod;
    }
}
