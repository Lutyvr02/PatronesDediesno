package TareaParcial2.ej4;

public class client {
    public static void main(String[] args) {
        whats whatsapp = new whats();

        user user1 = new user(whatsapp);
        user1.setNickname("usuario1");
        user1.setNombre("sfdfadWASFCBDSFF");

        user user2 = new user(whatsapp);
        user2.setNickname("usuario2");
        user2.setNombre("ASDAdsd");

        user user3= new user(whatsapp);
        user3.setNickname("usuario3");
        user3.setNombre("adsadcsaday");

        user user4 = new user(whatsapp);
        user4.setNickname("usuario4");
        user4.setNombre("adsswSADDAWQEDSFEW");

        user user5 = new user(whatsapp);
        user5.setNickname("usuario5");
        user5.setNombre("EWQW   QEDSFEQWDSFEW");

        user user6 = new user(whatsapp);
        user6.setNickname("usuario6");
        user6.setNombre("EGFEWQDASSFSQWSDA");

        user user7 = new user(whatsapp);
        user7.setNickname("usuario7");
        user7.setNombre("ERWGFWHDGDWAy");

        user user8 = new user(whatsapp);
        user8.setNickname("usuario8");
        user8.setNombre("JHGDFADFSGDSDF");

        user user9 = new user(whatsapp);
        user9.setNickname("usuario9");
        user9.setNombre("JYHGREFSGDDFASD");

        user user10 = new user(whatsapp);
        user10.setNickname("usuario10");
        user10.setNombre("DSFADEWADSFAWAS");

        whatsapp.addPersonaToChat(user1).addPersonaToChat(user2)
                .addPersonaToChat(user3).addPersonaToChat(user4)
                .addPersonaToChat(user5).addPersonaToChat(user6)
                .addPersonaToChat(user7).addPersonaToChat(user8)
                .addPersonaToChat(user9).addPersonaToChat(user10);

        user1.send("fddasfvsdawssdasdas");
        user10.send("sdaadsfafaf");
    }
}
