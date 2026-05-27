
public class Diretor extends FuncionarioCLT {

    private double bonusParticipacao;

    public Diretor(String n, double s, double bonusParticipacao) {
        super(n, s);
        this.bonusParticipacao = bonusParticipacao;
    }

    @Override
    public double calcularSalarioLiquido() {

        double salarioCLT = super.calcularSalarioLiquido();

        return salarioCLT + bonusParticipacao;
    }

}
