package Composite.example;

public abstract class Component {
    private String atri1;
    private String atri2;

    public Component(String atri1, String atri2) {
        this.atri1 = atri1;
        this.atri2 = atri2;
    }

    public String getAtri1() {
        return atri1;
    }

    public void setAtri1(String atri1) {
        this.atri1 = atri1;
    }

    public String getAtri2() {
        return atri2;
    }

    public void setAtri2(String atri2) {
        this.atri2 = atri2;
    }

    public abstract void operacion();
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract Component get(int posi);
}
