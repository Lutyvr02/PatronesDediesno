package Builder.exercises;

public class I7 extends buildercompu{

    @Override
    public void buildMouse() {
        super.getComputadora().setMouse("Luminos");
    }

    @Override
    public void buildMemoria() {
        super.getComputadora().setMemoria("16gb");
    }

    @Override
    public void buildProcesador() {
        super.getComputadora().setProcesador("i7");
    }

    @Override
    public void buildVideo() {
        super.getComputadora().setVideo("8");
    }

    @Override
    public void buildMonitor() {
        super.getComputadora().setMonitor("32");
    }

    @Override
    public void buildTeclado() {
        super.getComputadora().setTeclado("Luminos");
    }


}
