package chainrespo;

public class pos extends menejafracaso {

    @Override
    public void catchFail(fracaso f) {
        if (f.getSeveridad().equals("MEDIA")) {
            System.out.println("La siguiente falla debe ser derivada a un Product Owner:");
            f.showInfo();
            System.out.println();
        } else {
            super.getNext().catchFail(f);
        }
    }
}