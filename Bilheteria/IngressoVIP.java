
class IngressoVIP extends Ingresso {

    public IngressoVIP(String nomeEvento, double valorBase) {
        super(nomeEvento, valorBase);
    }

    @Override
    public double calcularValorFinal() {
        return valorBase + 120.00;
    }

    @Override
    public void imprimirTicket() {
        super.imprimirTicket();

        System.out.println("-- ACESSO VIP LIBERADO --");
    }
}
