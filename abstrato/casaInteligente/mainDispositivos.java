
public class mainDispositivos {

    public static void main(String[] args) {

        Televisao tv = new Televisao();
        LampadaRGB lampada = new LampadaRGB();

        tv.ligar();
        tv.desligar();

        lampada.ligar();
        lampada.desligar();
    }
}
