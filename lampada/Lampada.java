
public class Lampada {

    private boolean ligada;
    private String cor;

    public Lampada(String corInicial) {
        this.cor = corInicial;
        this.ligada = false;
    }

    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public void ImprimirStatus() {
        if (this.ligada == true) {
            System.out.println("ligada");
        } else {
            System.out.println("desligada");
        }
        System.out.println("cor " + this.cor);
    }
}
