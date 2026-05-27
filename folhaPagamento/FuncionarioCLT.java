
public class FuncionarioCLT extends Funcionario {

    public FuncionarioCLT(String n, double s) {
        super(n, s);
    }

    @Override
    public double calcularSalarioLiquido() {
        double inss = salarioBase * 0.08;
        double valeTransporte = salarioBase * 0.06;

        return salarioBase - inss - valeTransporte;
    }
}
