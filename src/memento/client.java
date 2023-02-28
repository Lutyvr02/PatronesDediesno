package memento;

public class client {
    public static void main(String[] args) {
        backmanager backupManager = new backmanager();

        basedatos bada = new basedatos();

        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        backupManager.addMemento(new back("enero", bada));

        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        backupManager.addMemento(new back("febrero", bada));


        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        backupManager.addMemento(new back("marzo", bada));


        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        backupManager.addMemento(new back("abril", bada));


        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        bada.insertPersona(new personas("asdasdasd","3123123",123123));
        backupManager.addMemento(new back("mayo", bada));

        basedatos bd_enero = backupManager.getMemento(0).getBaseDeDatos();
        basedatos bd_febrero = backupManager.getMemento(1).getBaseDeDatos();
        basedatos bd_marzo = backupManager.getMemento(2).getBaseDeDatos();
        basedatos bd_abril = backupManager.getMemento(3).getBaseDeDatos();
        basedatos bd_mayo = backupManager.getMemento(4).getBaseDeDatos();

        bd_febrero.mostrarTodasLasPersonas();
    }
}
