package bridge.conbridge;

public class Windows implements Sisoperativo{
    bits arch;
    public Windows(bits arch) {
        this.arch = arch;
    }
    @Override
    public void elegirsistemaop() {
        arch.aplicararquitectura();
    }
}
