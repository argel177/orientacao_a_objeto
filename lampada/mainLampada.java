
public class mainLampada {

    public static void main(String[] args) {
        Lampada lampada = new Lampada("vermelha");

        lampada.ligar();
        lampada.ImprimirStatus();

        lampada.desligar();
        lampada.ImprimirStatus();
    }
}
