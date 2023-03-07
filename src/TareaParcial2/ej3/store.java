package TareaParcial2.ej3;
import java.util.ArrayList;
import java.util.List;
public class store {
    private String nombre;
    private intsrtat strategy;
    private List<celu> celist = new ArrayList<>();
    public store addCelular(celu ce){
        this.celist.add(ce);
        return this;
    }

    public store(String nombre) {
        this.nombre = nombre;
    }

    public List<celu> getCelist() {
        return celist;
    }

    public void setCelist(List<celu> celist) {
        this.celist = celist;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public intsrtat getStrategy() {
        return strategy;
    }

    public void setStrategy(intsrtat stra) {
        this.strategy = stra;
    }

    public void ordenamiento(){
        this.strategy.ordenamiento(this.celist.size());
    }
}
