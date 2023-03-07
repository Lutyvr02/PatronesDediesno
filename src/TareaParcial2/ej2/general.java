package TareaParcial2.ej2;

public class general  implements iejerc {
    private iejerc next;
    @Override
    public void orden(ordenes orden) {
        if (orden.getType().equals("reuniones importantes")) {
            orden.showInfo();
            System.out.println("El general hara la tarea lo mas pronto posible");
        } else {
            System.out.println("No hay nadie disponible");
        }
    }

    @Override
    public void setSig(iejerc ejercito) {
        next = ejercito;
    }

    @Override
    public iejerc next() {
        return next;
    }


}