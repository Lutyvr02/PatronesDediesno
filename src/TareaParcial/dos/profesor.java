package TareaParcial.dos;

public class profesor {
    private String nombre;
    private String apellido;
    private double sueldo;
    private int carga_horaria;
    private boolean curso_educacion_superior;
    private boolean acceso_plataforma;
    private boolean marcado_biometrico;
    private String marcado_hoja_de_entrada;
    private String marcado_hoja_de_salida;

    public profesor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public boolean isCurso_educacion_superior() {
        return curso_educacion_superior;
    }

    public void setCurso_educacion_superior(boolean curso_educacion_superior) {
        this.curso_educacion_superior = curso_educacion_superior;
    }

    public boolean isAcceso_plataforma() {
        return acceso_plataforma;
    }

    public void setAcceso_plataforma(boolean acceso_plataforma) {
        this.acceso_plataforma = acceso_plataforma;
    }

    public boolean isMarcado_biometrico() {
        return marcado_biometrico;
    }

    public void setMarcado_biometrico(boolean marcado_biometrico) {
        this.marcado_biometrico = marcado_biometrico;
    }

    public String getMarcado_hoja_de_entrada() {
        return marcado_hoja_de_entrada;
    }

    public void setMarcado_hoja_de_entrada(String marcado_hoja_de_entrada) {
        this.marcado_hoja_de_entrada = marcado_hoja_de_entrada;
    }

    public String getMarcado_hoja_de_salida() {
        return marcado_hoja_de_salida;
    }

    public void setMarcado_hoja_de_salida(String marcado_hoja_de_salida) {
        this.marcado_hoja_de_salida = marcado_hoja_de_salida;
    }

    @Override
    public profesor clone() {
        profesor ty = new profesor(this.nombre,this.apellido);
        ty.setSueldo(sueldo);
        ty.setCarga_horaria(carga_horaria);
        ty.setCurso_educacion_superior(curso_educacion_superior);
        ty.setAcceso_plataforma(acceso_plataforma);
        ty.setMarcado_biometrico(marcado_biometrico);
        ty.setMarcado_hoja_de_entrada(marcado_hoja_de_entrada);
        ty.setMarcado_hoja_de_salida(marcado_hoja_de_salida);

        return ty;
    }

    public void showInfo() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Sueldo: "+sueldo+" Bs.");
        System.out.println("Carga horaria: "+carga_horaria+" hrs.");

        System.out.print("Da curso de edu. superior?");
        if (curso_educacion_superior) {
            System.out.println("SI");
        }else {
            System.out.println("NO");
        }

        System.out.print("Tiene acceso a la plataforma?");
        if (acceso_plataforma) {
            System.out.println("SI");
        }else {
            System.out.println("NO");
        }

        System.out.print("Tiene marcado biologico?");
        if (marcado_biometrico) {
            System.out.println("SI");
        }else {
            System.out.println("NO");
        }

        System.out.println("Hora de entrada: "+marcado_hoja_de_entrada);
        System.out.println("Hora de salida: "+marcado_hoja_de_salida);

    }

}
