package chainrespo;

public abstract class menejafracaso {
    private menejafracaso next;

    public menejafracaso getNext() {
        return next;
    }

    public void setNext(menejafracaso next) {
        this.next = next;
    }

    public abstract void catchFail(fracaso fail);
}
