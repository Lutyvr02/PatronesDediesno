package memento;

public class back {
    private basedatos baseDeDatos;
    private String message;

    public back(String message, basedatos baseDeDatos) {
        this.message = message;
        this.baseDeDatos = baseDeDatos.clone();
    }

    public basedatos getBaseDeDatos() {
        return baseDeDatos;
    }

    public void setBaseDeDatos(basedatos baseDeDatos) {
        this.baseDeDatos = baseDeDatos;
    }
}
