package chainrespo;

public class qas extends menejafracaso {

    @Override
    public void catchFail(fracaso f) {
        if (f.getSeveridad().equals("ALTA")) {
            System.out.println("La siguiente falla debe ser derivada a el equipo de Control de Calidad:");
            f.showInfo();
            System.out.println();
        } else {
            super.getNext().catchFail(f);
        }
    }
}
