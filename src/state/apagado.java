package state;

public class apagado implements intestados{
    @Override
    public void cambiarComponentes(Compu com) {
        System.out.println("Apagando");
        com.getProgramasAbiertos().clear();
        com.getPro().setConsumo(1);
        com.getRm().setConsumo(1);
        System.out.println("Se apago el pc");
    }
}
