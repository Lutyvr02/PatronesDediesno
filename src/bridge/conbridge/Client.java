package bridge.conbridge;

public class Client {
    public static void main(String[] args){
        bits iArch64 = new bits64();
        bits iArch86 = new bits86();
        Sisoperativo windows = new Windows(iArch64);
        Sisoperativo linux = new Linux(iArch86);

        windows.elegirsistemaop();
        linux.elegirsistemaop();
    }
}
