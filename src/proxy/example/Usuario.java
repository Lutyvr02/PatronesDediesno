package proxy.example;
public class Usuario {
    private String nombreUser;
    private String Password;

    public Usuario(String nombreUser, String Password) {
        this.nombreUser = nombreUser;
        this.Password = Password;
    }

    public String getNombreUser() {
        return nombreUser;
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public void show(){
        System.out.println();
        System.out.println(">>>>>>> Usuario <<<<<<<<");
        System.out.println("Nombre: "+ nombreUser);
        System.out.println("Contraseña: "+ Password);
    }
}
