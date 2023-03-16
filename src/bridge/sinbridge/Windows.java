package bridge.sinbridge;

public class Windows implements Iplataforma{

    public Windows() {
        System.out.println("Encendiendo este equipo Windows");
    }

    @Override
    public void usarx86bits() {
        System.out.println("Se esta usando 86bits");
    }

    @Override
    public void usarx64bits() {
        System.out.println("Se esta usando 64bits");
    }
}
