package mediator;

public class client {
    public static void main (String args[]){

        medio chatQA = new medio();
        medio chatDev = new medio();
        medio chatGeneral = new medio();

        pro q1 = new qualias(chatQA)
                .setGrado("grado 1").setCi("4474").setName("Horacio");
        pro q2 = new qualias(chatQA)
                .setGrado("grado 2").setCi("6660").setName("Vivian");
        pro q3 = new qualias(chatQA)
                .setGrado("grado3").setCi("9072").setName("Ema");

        pro dv1 =  new devlop(chatDev)
                .setLenguaje("java").setCi("1234").setName("Andres");
        pro dv2 =  new devlop(chatDev)
                .setLenguaje("c++").setCi("7893").setName("Celeste");
        pro dv3 =  new devlop(chatDev)
                .setLenguaje("kotlin").setCi("5908").setName("Pablo");

        pro m1 = new scrummas(chatGeneral)
                .setCertificaciones("iso-9090").setCi("2273").setName("Alexis");
        pro m2 = new scrummas(chatGeneral)
                .setCertificaciones("iso-8791").setCi("9087").setName("Tommy");
        pro m3 =  new scrummas(chatGeneral)
                .setCertificaciones("iso-7821").setCi("1726").setName("Paul");

        chatGeneral.addProfesionalToTheChat(dv1)
                .addProfesionalToTheChat(dv2)
                .addProfesionalToTheChat(dv3)
                .addProfesionalToTheChat(q1)
                .addProfesionalToTheChat(q2)
                .addProfesionalToTheChat(q3)
                .addProfesionalToTheChat(m1)
                .addProfesionalToTheChat(m2)
                .addProfesionalToTheChat(m3);

        chatQA.addProfesionalToTheChat(q1)
                .addProfesionalToTheChat(q2)
                .addProfesionalToTheChat(q3);

        chatDev.addProfesionalToTheChat(dv1)
                .addProfesionalToTheChat(dv2)
                .addProfesionalToTheChat(dv3);


        q1.send("Buenos dias a los QAs");
        dv3.send("Presente todos los DEVs");
        m2.send("Bienvenidos todos!!!!");

    }
}
