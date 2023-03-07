package TareaParcial2.ej4;

public abstract class persona {
    protected  ichannel canal;
    private String nombre;
    private String nickname;
    public void showInfo(){
        System.out.println("el nombre de usuario es: "+nickname);
        System.out.println("el nombre es: "+nombre);
    }
    public abstract void send(String msg);
    public abstract void received(String msg);

    public persona(ichannel canal){
        this.canal=canal;
    }

    public ichannel getCanal() {
        return canal;
    }

    public void setCanal(ichannel canal) {
        this.canal = canal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
