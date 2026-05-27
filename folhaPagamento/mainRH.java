
public class mainRH {

    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[4];

        funcionarios[0] = new Funcionario("André", 3000.0);
        funcionarios[1] = new FuncionarioCLT("Ana", 4000.0);
        funcionarios[2] = new FuncionarioPJ("Marcos", 5000.0);
        funcionarios[3] = new Diretor("Fernanda", 10000.0, 3000.0);

        double totalFolha = 0;

        for (Funcionario f : funcionarios) {

            double salarioLiquido = f.calcularSalarioLiquido();

            System.out.println("Funcionário: " + f.nome);
            System.out.println("Salário Líquido: R$ " + salarioLiquido);

            totalFolha += salarioLiquido;
        }

        System.out.println("Custo total da folha: R$ " + totalFolha);
    }

}
