package memento;

    import java.util.ArrayList;
import java.util.List;

    public class backmanager {
        private List<back> backupList = new ArrayList<>();

        public backmanager addMemento(back bk){
            backupList.add(bk);
            return this;
        }

        public back getMemento(int index){
            return backupList.get(index);
        }
}
