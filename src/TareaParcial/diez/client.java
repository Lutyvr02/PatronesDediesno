package TareaParcial.diez;

public class client {

    public static void main(String[] args) {
        verificacion v1 = new verificacion(new transpor("1efwrwerwe", "Toyota corolla"));
        v1.pagar(350);

        verificacion v2 = new verificacion(new transpor("4123eqwswqedqw", "toyota ipsum"));
        v2.pagar(450);

        verificacion v3 = new verificacion(new transpor("75643rqewdasdd", "aefadsfdasdf"));
        v3.pagar(150);

        verificacion v4 = new verificacion(new transpor("87623ewt", "Airuetryearwdwe3"));
        v4.pagar(560);

        verificacion v5 = new verificacion(new transpor("987yersw", "u6ytefsdsdfsd"));
        v5.pagar(150);

        verificacion v6 = new verificacion(new transpor("09876twesaf", "jhgrfeafsgf"));
        v6.pagar(200);

    }
}
