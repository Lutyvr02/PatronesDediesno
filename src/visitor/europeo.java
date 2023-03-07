package visitor;

public class europeo implements ipaises {

    @Override
    public void libreCambio(iviaj viajero, double dinero) {
        viajero.convertirDinero(dinero, this);
    }
}
