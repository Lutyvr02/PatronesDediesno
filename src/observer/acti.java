package observer;

import java.util.ArrayList;
import java.util.List;

public class acti implements inotificacion {

    public acti(String nombre, noitifi ty) {
        this.name = nombre;
        this.ty = ty;
    }

    private String name;
    private List<client> clientesList = new ArrayList<>();
    private noitifi ty;

    @Override
    public void not() {
        for (client ty:clientesList) {
            System.out.println("buenas, "+ty.getName()+" tienes una notificacion de: "+name);
            ty.update(this.ty);
        }

    }
    @Override
    public void addUser(client cl) {
        clientesList.add(cl);

    }

}
