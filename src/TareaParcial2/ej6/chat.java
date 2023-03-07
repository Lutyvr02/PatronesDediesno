package TareaParcial2.ej6;
import java.util.ArrayList;
import java.util.List;
public class chat implements ichannel {
    private List<programador> devs = new ArrayList<>();

    @Override
    public ichannel suscribirte(programador dev) {
        devs.add(dev);
        return this;
    }

    @Override
    public ichannel quitarsubscripcion(programador dev) {
        devs.remove(dev);
        return this;
    }

    public void enviar1aTodos(String mensaje, persona persona) {
        System.out.print("De: ");
        persona.showInfo();
        for (persona persona1 : devs){
            if (!persona.equals(persona1)){
                persona1.recibir(mensaje);
            }
        }
    }

    public void enviarde1a1(String mensaje, persona em, persona rec) {
        System.out.print("De: ");
        em.showInfo();
        System.out.print("Para: ");
        for(persona persona:devs){
            if(rec.equals(persona)){
                persona.recibir(mensaje);
            }
        }
    }


}
