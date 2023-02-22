package TareaParcial.cuatro;

public class materia {
    private String nombre;
    private estu ty;

    public materia(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public estu getEstudiante() {
        return ty;
    }

    public void setEstudiante(estu ty) {
        this.ty = ty;
    }

    public void inscribir(estu ty) {
        System.out.println("El ty "+ty.getNombre()+", C.I.:"+ty.getCi()+", ha sido inscrito en la materia "+nombre);
    }

}
