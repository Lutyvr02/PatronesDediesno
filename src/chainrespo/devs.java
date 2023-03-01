package chainrespo;

public class devs extends menejafracaso {

    @Override
    public void catchFail(fracaso f) {
        if (f.getSeveridad().equals("CRITICA")) {
            System.out.println("La siguiente falla debe ser derivada a un Desarrollador:");
            f.showInfo();
            System.out.println();
        } else {
            System.out.println("La falla contiene un nombre de severidad invalido!");
        }
    }
}