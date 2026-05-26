
public class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String n, double s) {
        this.nome = n;
        this.salario = s;

    }

    public double CalcularBonus() {
        return this.salario * 0.1;
    }

}
