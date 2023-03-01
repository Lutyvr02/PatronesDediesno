package chainrespo;

public class detectafracaso extends menejafracaso {
    private devs dev;
    private qas q;
    private pos p;
    private sts s;

    public detectafracaso() {
        this.dev = new devs();
        this.q = new qas();
        this.p = new pos();
        this.s = new sts();

        super.setNext(s);
        s.setNext(p);
        p.setNext(q);
        q.setNext(dev);
    }

    @Override
    public void catchFail(fracaso f) {
        super.getNext().catchFail(f);
    }
}
