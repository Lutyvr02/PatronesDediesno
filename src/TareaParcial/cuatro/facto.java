package TareaParcial.cuatro;

public class facto {
    public static materia make(String type) {
        materia ty;

        switch (type.toLowerCase()){
            case "ingles":
                ty = new materia("ingles");
                break;
            case "historia":
                ty = new materia("historia");
                break;
            case "matematicas":
                ty = new materia("matematicas");
                break;
            case "lenguaje":
                ty = new materia("lenguaje");
                break;

            default:
                ty = new materia("sin asignar");
                break;
        }
        return ty;
    }
}
