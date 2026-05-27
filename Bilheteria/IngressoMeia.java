
class IngressoMeia extends Ingresso {

    public IngressoMeia(String nomeEvento, double valorBase) {
        super(nomeEvento, valorBase);
    }

    @Override
    public double calcularValorFinal() {
        return valorBase * 0.5;
    }
}
