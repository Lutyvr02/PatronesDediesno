package observer;

public class noitifi {
    private String ty;

    public noitifi(String ty) {
        this.ty = ty;
    }

    public String getTy() {
        return ty;
    }

    public void setTy(String ty) {
        this.ty = ty;
    }

    public void showNotificacion() {
        System.out.println(ty);
    }
}