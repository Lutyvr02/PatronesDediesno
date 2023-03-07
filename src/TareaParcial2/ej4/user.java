package TareaParcial2.ej4;

public class user extends persona {
    public user(ichannel canal){
        super(canal);
    }

    @Override
    public void received(String msg) {
        this.showInfo();
        System.out.println("Se recibio el mensaje: "+msg+"\n");
    }
    @Override
    public void send(String msg) {

        this.canal.send(msg,this);
    }

}
