package chainrespo;

public class client {

    public static void main(String[] args) {
        detectafracaso fd = new detectafracaso();

        fracaso f1 = new fracaso();
        f1.setTitulo("La pagina no funciona");
        f1.setSeveridad("baja");
        f1.setDescripcion("se olvidaron los datos\nla base de datos esta defectuosa");

        fracaso f2 = new fracaso();
        f2.setTitulo("los datos son incorrectos");
        f2.setSeveridad("media");
        f2.setDescripcion(
                "la informacion del producto esta incorrecta\nlos productos no tienen configuracion");

        fracaso f3 = new fracaso();
        f3.setTitulo("la pagina ofrecio las modificaciones incorrectas");
        f3.setSeveridad("alta");
        f3.setDescripcion(
                "la vista de la pagina no esta bien definida\nla pagina tiene baja calidad");

        fracaso f4 = new fracaso();
        f4.setTitulo("el usuario no existe");
        f4.setSeveridad("critica");
        f4.setDescripcion(
                "al iniciar sesion no inicia la cuenta\nerrores en el guardado de la base de datos");

        System.out.println("las fallas son las siguientes: ");
        fd.catchFail(f1);
        fd.catchFail(f2);
        fd.catchFail(f3);
        fd.catchFail(f4);
    }
}
