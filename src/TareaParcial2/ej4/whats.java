package TareaParcial2.ej4;
import java.util.ArrayList;
import java.util.List;
public class whats implements ichannel{
    private List<user> us = new ArrayList<>();

    public whats addPersonaToChat(user us){
        this.us.add(us);
        return this;
    }

    @Override
    public void send(String msg, persona per) {
        for(user user : us){
            if(!per.getNickname().equals(user.getNickname())){
                if(per.getNickname().equals("usuario nro1") && user.getNickname().equals("usuario nro2")){
                    user.received(msg);
                }else if(per.getNickname().equals("usuario nro10")){
                    user.received(msg);
                }

            }
        }
    }

}
