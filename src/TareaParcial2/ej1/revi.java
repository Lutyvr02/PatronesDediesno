package TareaParcial2.ej1;

import java.util.HashMap;
import java.util.Map;
public class revi {
    private Map<String, TareaParcial2.ej1.mementos> mementos = new HashMap<>();

    public mementos getRevision(String key) throws Exception {
        if (mementos.containsKey(key)) {
            System.out.println("Se restauro la version: " + key);
            return mementos.get(key);
        } else {
            throw new Exception("La version no existe");
        }
    }

    public revi createRevision(String nrorev, mementos mem) {
        System.out.println("la revision nro:  " + nrorev + " esta creada");
        mem.getTesis().showInfo();
        mementos.put(nrorev, mem);
        return this;
    }


}