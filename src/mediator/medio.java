package mediator;

import java.util.HashMap;
import java.util.Map;

public class medio implements ichannel {

    private Map<String, pro> chat = new HashMap<>();

    public medio addProfesionalToTheChat(pro profesional) {
        chat.put(profesional.getCi(), profesional);
        return this;
    }

    @Override
    public void send(String message, pro persona) {
        for (String ci : chat.keySet()) {
            pro prof = chat.get(ci);
            if (!persona.getCi().equals(ci)) {
                prof.received(message);
            }
        }
    }
}