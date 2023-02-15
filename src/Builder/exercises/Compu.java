package Builder.exercises;

public class Compu {
    private String monitor;
    private String teclado;
    private String mouse;
    private String memoria;
    private String procesador;
    private String video;


    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getTeclado() {
        return teclado;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }


    public void showInf() {
        System.out.println("El procesador es: "+procesador);
        System.out.println("El video es: "+video);
        System.out.println("El monitor es: "+monitor);
        System.out.println("La memoria es: "+memoria);
        System.out.println("El teclado es: "+teclado);
        System.out.println("El mouse es: "+mouse);

    }
}
