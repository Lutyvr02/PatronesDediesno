package TareaParcial2.ej2;

public class cabo implements iejerc {
    private iejerc next;

    @Override
    public void setSig(iejerc ejercito) {
        next = ejercito;
    }
    @Override
    public void orden(ordenes orden) {
        if (orden.getType().equals("Limpiar")) {
            orden.showInfo();
            System.out.println("El cabo hara la tarea lo mas pronto posible");
        } else {
            System.out.println("No hay nadie disponible");
            System.out.println("la tarea la hara el coronel");
            this.next.orden(orden);
        }
    }
    @Override
    public iejerc next() {
        return next;
    }
}