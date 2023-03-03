package observer;

public class clientrun {
    public static void main(String[] args) {
        acti premios = new acti("premio", new noitifi("gracias a tu fidelidad ganaste el paquete de 150mbs+whatsappx24hrs"));
        acti noticia = new acti("noticia", new noitifi("el paquete de: 150mbs+whatsappx24hrs acabara pronto"));
        acti preciosLlamadas = new acti("Ms minutos", new noitifi("Usa la oferta de 7 minutos por 5 pesos"));
        acti promociones = new acti("promos",new noitifi("la promo de 150mbs+whatsappx24hrs esta disponible"));

        client pe = new client("Pedro", "243132412312 LP", 14124124);
        client ma = new client("Maria", "41241241343 OR", 423423432);
        client ey = new client("Eynar", "13412412412 SC", 141241224);

        preciosLlamadas.addUser(ey);
        promociones.addUser(pe);
        promociones.addUser(ey);
        premios.addUser(pe);
        premios.addUser(ey);
        noticia.addUser(ma);
        noticia.addUser(ey);

        preciosLlamadas.not();
        promociones.not();
        premios.not();
        noticia.not();

    }
}
