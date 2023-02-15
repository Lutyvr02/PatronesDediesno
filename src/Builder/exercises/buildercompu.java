package Builder.exercises;

public abstract class buildercompu {
    private Compu com;

    public abstract void buildMonitor();

    public abstract void buildTeclado();

    public abstract void buildMouse();

    public abstract void buildMemoria();

    public Compu getComputadora() {
        return com;
    }

    public void ensamblarBaseComputadora() {
        com = new Compu();
    }


    public abstract void buildProcesador();

    public abstract void buildVideo();

}
