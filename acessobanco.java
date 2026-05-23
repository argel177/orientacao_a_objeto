
public class acessobanco {

    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("argel");

        double saldo = conta1.getSaldo();
        System.out.println("saldo atual " + saldo);
        conta1.depositar(250);
        conta1.sacar(250);

        System.out.println("Titular: " + conta1.getTitular());
        System.out.println("Saldo: " + conta1.getSaldo());
    }
}
