package TareaParcial2.ej2;

public class coronel implements iejerc{
    private iejerc next;
    @Override
    public void setSig(iejerc ejercito) {
        next = ejercito;
    }
    @Override
    public void orden(ordenes ty) {
        if( ty.getType().equals("desbloqueos")|| ty.getType().equals("manifestaciones")){
            ty.showInfo();
            System.out.println("Le coronel se encargara lo antes posible");
        }else {
            System.out.println("No hay nadie disponible");
            System.out.println("la tarea la hara el teniente");
            this.next.orden(ty);
        }
    }
    @Override
    public iejerc
    next() {
        return next;
    }
}
