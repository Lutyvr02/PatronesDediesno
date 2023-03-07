package TareaParcial2.ej5;
import java.util.ArrayList;
import java.util.List;
public class repositorios implements igith {
    private com commit;
    private String nombre;
    private List<iusuario> desarroladoresList = new ArrayList<>();

    @Override
    public void subscription(iusuario user) {
        desarroladoresList.add(user);
    }

    @Override
    public void removeDev(iusuario user) {
        desarroladoresList.remove(user);

    }

    @Override
    public void notify(String mensaje) {
        System.out.println("se esta enviando las notificaciones");
        this.desarroladoresList.stream().forEach(a -> a.recibir(mensaje));
    }

    public com restoreCommit(memen memento) {
        this.commit = memento.getCommit();
        System.out.println("restaurando el commit de la fecha: " + memento.getFecha());
        System.out.println("con la descripcion: " + memento.getDescripcion());
        System.out.println();
        notify("commit Restaurado con la fecha: " + memento.getFecha() + " con descripcion: " + memento.getDescripcion());
        return this.commit;
    }

    public memen newMemento(String descripcion, String fecha) {
        return new memen(commit, descripcion, fecha);

    }

    public void setCommit(com commit) {
        System.out.println("haciendo commit");
        this.commit = commit;
        this.commit.setLcod(commit.getLcod());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<iusuario> getDesarroladoresList() {
        return desarroladoresList;
    }

    public void setDesarroladoresList(List<iusuario> desarroladoresList) {
        this.desarroladoresList = desarroladoresList;
    }

}