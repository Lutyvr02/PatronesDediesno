package TareaParcial2.ej6;

public class code implements iestr{
    @Override
    public String mensaje(programador dev) {
        String informar = "el usuario: "+ dev.getNombre()+"  con el nickname: "+dev.getNickname()+" envio codigo ";
        return informar;
    }
}
