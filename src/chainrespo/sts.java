package chainrespo;

public class sts extends menejafracaso {

    @Override
    public void catchFail(fracaso f) {
        if (f.getSeveridad().equals("BAJA")) {
            System.out.println("La siguiente falla debe ser derivada a el Equipo de Soporte:");
            f.showInfo();
            System.out.println();
        } else {
            super.getNext().catchFail(f);
        }
    }

}
