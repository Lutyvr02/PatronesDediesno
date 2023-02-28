package memento;

    import java.util.HashMap;
import java.util.Map;

    public class basedatos implements clonable {
        private Map<String,personas> personaList = new HashMap<>();

        public void insertPersona(personas persona){
            personaList.put(persona.getCi(), persona);
        }
        public void mostrarTodasLasPersonas(){
            for (personas p: personaList.values()) {
                System.out.println(p);
            }
        }

        public personas getPersona(String ci){
            if (!personaList.containsKey(ci))
                throw new RuntimeException("la persona con el ci: "+ci+" no existe");
            return personaList.get(ci);
        }



        private void setPersonaList(Map<String, personas> personaList) {
            this.personaList = personaList;
        }

        @Override
        public basedatos clone() {
            basedatos clone = new basedatos();
            clone.setPersonaList(new HashMap<>(this.personaList));
            return clone;
        }
}
