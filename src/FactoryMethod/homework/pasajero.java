package FactoryMethod.homework;

public class pasajero {
    private String nombre;
    private int CI;

    public void setCI(int CI) {
        this.CI = CI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCI() {
        return CI;
    }

    public String getNombre() {
        return nombre;
    }
    public void showAlgo() {
        System.out.println("nombre: "+ nombre + "CI: "+ CI);
    }
}
