package visitor;

public class estadounidense implements ipaises {
    @Override
    public void libreCambio(iviaj viajero, double dinero) {
        viajero.convertirDinero(dinero, this);
    }
}
