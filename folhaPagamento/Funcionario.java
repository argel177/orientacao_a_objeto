
public class Funcionario {

    protected String nome;
    protected double salarioBase;

    public Funcionario(String n, double s) {
        this.nome = n;
        this.salarioBase = s;
    }

    public double calcularSalarioLiquido() {
        return salarioBase;
    }
}
