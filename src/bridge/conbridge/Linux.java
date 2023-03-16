package bridge.conbridge;

public class Linux implements Sisoperativo{
    bits arch;
    public Linux(bits arch) {
        this.arch = arch;
    }
    @Override
    public void elegirsistemaop() {
        arch.aplicararquitectura();
    }
}
