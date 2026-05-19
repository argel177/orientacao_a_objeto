
public class Banco {

    public static void main(String[] args) {

        Conta conta1 = new Conta();

        conta1.titular = "Argel";
        conta1.saldo = 0.00;

        conta1.depositar(150);
        conta1.sacar(250);

        System.out.println("Titular: " + conta1.titular);
        System.out.println("Saldo: " + conta1.saldo);
    }
}
