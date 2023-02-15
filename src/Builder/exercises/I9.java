package Builder.exercises;

public class I9 extends buildercompu{
    @Override
    public void buildMemoria() {
        super.getComputadora().setMemoria("32gb");
    }

    @Override
    public void buildProcesador() {
        super.getComputadora().setProcesador("i9");
    }

    @Override
    public void buildVideo() {
        super.getComputadora().setVideo("16");
    }
    @Override
    public void buildMonitor() {
        super.getComputadora().setMonitor("45");
    }

    @Override
    public void buildTeclado() {
        super.getComputadora().setTeclado("Luminos");
    }

    @Override
    public void buildMouse() {
        super.getComputadora().setMouse("Gamer");
    }



}
