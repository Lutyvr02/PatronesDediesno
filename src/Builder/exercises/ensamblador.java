package Builder.exercises;

public class ensamblador {
    private buildercompu build;


    public void ensamblarComputadora() {
        this.build.ensamblarBaseComputadora();
        this.build.buildMemoria();
        this.build.buildMonitor();
        this.build.buildMouse();
        this.build.buildProcesador();
        this.build.buildTeclado();
        this.build.buildVideo();
    }

    public Compu getComputadoraEnsamblada() {
        return build.getComputadora();
    }

    public void setBuild(buildercompu build) {
        this.build = build;
    }
}
