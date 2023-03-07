package visitor;

public class boliviano implements ipaises {
        @Override
        public void libreCambio(iviaj viajero, double dinero) {
            viajero.convertirDinero(dinero, this);
        }
}
