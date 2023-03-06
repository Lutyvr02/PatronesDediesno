package state;

import java.util.List;
public class reinicio implements intestados {


    @Override
    public void cambiarComponentes(Compu com) {
        System.out.println("Reiniciando...");
        List<String> openPrograms = com.getProgramasAbiertos();
        for (String programa : openPrograms) {
            System.out.println("cerrando los siguientes programas: " + programa);
        }
        com.getProgramasAbiertos().clear();
        com.getPro().setConsumo(0);
        com.getRm().setConsumo(0);
        System.out.println("computadora reiniciada");
    }
}