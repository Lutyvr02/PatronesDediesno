package TareaParcial2.ej5;

public class developer implements iusuario {

    private String nombre;
    private String nickname;
    public developer(String nombre, String nickname) {
        this.nombre = nombre;
        this.nickname = nickname;
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
    public void showInfo() {
        System.out.println("El desarrollador: ");
        System.out.println("con el nombre: " + nombre + "y el nickname: " + nickname);
    }
    @Override
    public void recibir(String mensaje) {
        showInfo();
        System.out.println("notificacion nueva: " + mensaje);
    }
}
