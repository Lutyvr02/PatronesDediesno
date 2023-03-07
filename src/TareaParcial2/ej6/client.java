package TareaParcial2.ej6;

public class client {
    public static void main(String[] args) {
        String informe = "codigo";
        informaciones informar;
        chat chat = new chat();
        programador d1 = new programador("HARDY","Michael Hardy").setCanal(chat);
        programador d2 = new programador("CardiC", "Tobias Forge").setCanal(chat);
        programador d3 = new programador("Red","Morgan Wallen");
        programador d4 = new programador("MShadows","Matt Shadows");

        chat.suscribirte(d1);
        chat.suscribirte(d2);
        chat.suscribirte(d3);
        chat.suscribirte(d4);
        if(informe.equals("codigo")){
            informar = new informaciones(new code());
        }else{
            informar = new informaciones(new registros());
        }
        chat.enviar1aTodos(informar.crearInforme(d1),d1);


    }
}
