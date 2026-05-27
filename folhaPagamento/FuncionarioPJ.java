
public class FuncionarioPJ extends Funcionario {

    public FuncionarioPJ(String n, double s) {
        super(n, s);
    }

    @Override
    public double calcularSalarioLiquido() {
        return salarioBase + 500;
    }
}
