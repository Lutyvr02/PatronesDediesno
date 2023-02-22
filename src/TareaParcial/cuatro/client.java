package TareaParcial.cuatro;

public class client {
    public static void main(String[] args) {
        estu e1 = new estu("844579-1P", "udygdfgs");
        estu e2 = new estu("544567", "Rjtdhgsdd");
        estu e3 = new estu("777666", "Ajfhdgsdhfdgdf");
        estu e4 = new estu("123475", "iuyetrghderw");
        estu e5 = new estu("3529782", "Carlos Santana");
        estu e6 = new estu("6969420","oiuyhgds");
        String historia = "historia";
        String ingles = "ingles";

        String mate = "matematicas";
        String lenguaje = "lenguaje";


        facto.make(lenguaje).inscribir(e1);
        facto.make(ingles).inscribir(e2);
        facto.make(mate).inscribir(e3);
        facto.make(historia).inscribir(e4);
        facto.make(lenguaje).inscribir(e5);
        facto.make(historia).inscribir(e6);

    }
}
