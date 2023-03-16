package bridge.sinbridge;

public class Linux implements Iplataforma{

    public Linux() {
        System.out.println("Encendiendo este equipo Linux");
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
