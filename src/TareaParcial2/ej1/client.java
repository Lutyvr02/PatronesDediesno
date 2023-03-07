package TareaParcial2.ej1;

public class client {
    public static void main(String[] args) {
        revi revision = new revi();
        estadosguardados estado = new estadosguardados();

        tesis tes = new tesis("Warducks");

        tes.setCambios("Se incluyo los primero cambios");
        estado.setEst(tes);
        revision.createRevision("1",estado.newEst(1));

        tes.setCambios("Se usaron imagenes");
        estado.setEst(tes);
        revision.createRevision("2",estado.newEst(2));

        tes.setCambios("Se añadieron palabras claves");
        estado.setEst(tes);
        revision.createRevision("3",estado.newEst(3));

        tes.setCambios("Se explica la razon del nombre");
        estado.setEst(tes);
        revision.createRevision("4",estado.newEst(4));

        tes.setCambios("Se explica la razon del videojuego");
        estado.setEst(tes);
        revision.createRevision("5",estado.newEst(5));

        try{
            tes = estado.restoreEst(revision.getRevision("3"));
            tes.showInfo();
        } catch (Exception e2){
            System.out.println(e2.getMessage());
        }

    }
}
