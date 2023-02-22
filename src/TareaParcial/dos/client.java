package TareaParcial.dos;

public class client {
    public static void main(String[] args) {
        profesor p1 = new profesor("Ramiro", "Flores");

        p1.setSueldo(5000.00);
        p1.setCarga_horaria(80);
        p1.setCurso_educacion_superior(true);
        p1.setAcceso_plataforma(true);
        p1.setMarcado_biometrico(false);
        p1.setMarcado_hoja_de_entrada("08:00");
        p1.setMarcado_hoja_de_salida("18:00");

        profesor p2 = p1.clone();
        p2.setNombre("Gabriel");
        p2.setApellido("Hernandez");

        profesor p3 = p1.clone();
        p3.setNombre("Geronimo");
        p3.setApellido("Bump");

        profesor p4 = p1.clone();
        p4.setNombre("James");
        p4.setApellido("McGill");

        profesor p5 = p1.clone();
        p5.setNombre("Howard");
        p5.setApellido("Hamlin");

        profesor p6 = p1.clone();
        p6.setNombre("Ignacio");
        p6.setApellido("Vargas");

        profesor p7 = p1.clone();
        p7.setNombre("Kimberly");
        p7.setApellido("Wexler");

        profesor p8 = p1.clone();
        p8.setNombre("Elton");
        p8.setApellido("John");

        profesor p9 = p1.clone();
        p9.setNombre("Damon");
        p9.setApellido("Albarn");

        profesor p10 = p1.clone();
        p10.setNombre("Charles");
        p10.setApellido("McGill");

        profesor p11 = p1.clone();
        p11.setNombre("Howard");
        p11.setApellido("Hamlin");

        profesor p12 = p1.clone();
        p12.setNombre("Walter");
        p12.setApellido("White");

        profesor p13 = p1.clone();
        p13.setNombre("Hank");
        p13.setApellido("Schrader");

        profesor p14 = p1.clone();
        p14.setNombre("Keanu");
        p14.setApellido("Reeves");

        profesor p15 = p1.clone();
        p15.setNombre("Robert");
        p15.setApellido("Pattinson");

        p1.showInfo();
        p2.showInfo();
        p3.showInfo();
        p4.showInfo();
        p5.showInfo();
        p6.showInfo();
        p7.showInfo();
        p8.showInfo();
        p9.showInfo();
        p10.showInfo();
        p11.showInfo();
        p12.showInfo();
        p13.showInfo();
        p14.showInfo();
        p15.showInfo();

    }
}
