package TareaParcial2.ej6;

public class programador implements persona{
    private String nickname;
    private String nombre;
    protected ichannel canal;

    @Override
    public void recibir(String mensaje) {
        showInfo();
        System.out.println("hay una nueva notificacion"+mensaje);
    }


    @Override
    public void showInfo() {
        System.out.println("El developer: ");
        System.out.println("con el nombre: "+nombre+" y en nickname: "+nickname);
    }

    public ichannel getCanal() {
        return canal;
    }

    public programador setCanal(ichannel canal) {
        this.canal = canal;
        return this;
    }


    public programador(String nickname, String nombre) {
        this.nickname = nickname;
        this.nombre = nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
