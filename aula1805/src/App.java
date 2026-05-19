
public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Aqui é a main");

        Cliente cliente1 = new Cliente();
        cliente1.nome = "Mauricio";
        cliente1.idade = 23;
        cliente1.CPF = "12345678910";
        cliente1.saldoEmLoja = 100.00;
        cliente1.Telefone = "4798775541";

        Cliente cliente2 = new Cliente();
        cliente2.nome = "Alex";
        cliente2.idade = 28;
        cliente2.CPF = "1457454510";
        cliente2.saldoEmLoja = 1050.00;

        System.out.println(cliente1.Telefone);
    }
}
