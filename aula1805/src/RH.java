
import java.util.Scanner;

public class RH {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Funcionario f1 = new Funcionario();

        System.out.print("Digite o nome do funcionário: ");
        f1.nome = teclado.nextLine();

        System.out.print("Digite o salário atual: ");
        f1.salario = teclado.nextDouble();

        System.out.println("O salário atual de " + f1.nome
                + " é de R$ " + f1.salario);

        System.out.print("Digite o valor do aumento: ");
        double aumento = teclado.nextDouble();

        f1.receberAumento(aumento);

        System.out.println("O salário com aumento de " + f1.nome + " é de R$ " + f1.salario);

    }
}
