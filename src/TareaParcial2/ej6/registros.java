package TareaParcial2.ej6;

public class registros implements iestr{
    @Override
    public String mensaje(programador dev) {
        String informar = "el usuario: "+ dev.getNombre()+" con el nickname: "+dev.getNickname()+" va a tomar una tarea del registro";
        return informar;
    }
}
