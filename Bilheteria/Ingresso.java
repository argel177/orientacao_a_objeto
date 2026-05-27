
class Ingresso {

    protected String nomeEvento;
    protected double valorBase;

    public Ingresso(String nomeEvento, double valorBase) {
        this.nomeEvento = nomeEvento;
        this.valorBase = valorBase;
    }

    public double calcularValorFinal() {
        return valorBase;
    }

    public void imprimirTicket() {
        System.out.println("Evento: " + nomeEvento);
        System.out.println("Valor Final: R$ " + calcularValorFinal());
    }
}
