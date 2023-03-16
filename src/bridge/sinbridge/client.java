package bridge.sinbridge;

public class client {
    public static void main(String[] args){
        Iplataforma lin = new Linux();
        Iplataforma win = new Windows();

        lin.usarx64bits();
        lin.usarx86bits();

        win.usarx86bits();
        win.usarx64bits();
    }
}
