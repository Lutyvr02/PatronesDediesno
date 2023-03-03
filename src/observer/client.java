package observer;

public class client implements iusuario {

    private String name;
    private String ci;
    private int cel;

    public client(String name, String ci, int cel) {
        this.name = name;
        this.ci = ci;
        this.cel = cel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public int getCel() {
        return cel;
    }

    public void setCel(int cel) {
        this.cel = cel;
    }

    public void infoUser() {
        System.out.println("buenas: " + name + ", con el ci de: " + ci + " y el celular de: " + cel);
    }

    @Override
    public void update(noitifi ty) {
        ty.showNotificacion();

    }
}
