package TareaParcial2.ej5;

    import java.util.HashMap;
import java.util.Map;

    public class git {

        public memen getCommit(String hash){

            try{
                return commits.get(hash);

            } catch (Exception e){
                System.out.println("commit sin registrar");
                return null;
            }

        }
        private Map<String, memen> commits = new HashMap<>();


        public void createCommit(memen memento){
            commits.put(memento.getFecha(), memento);
        }


}
