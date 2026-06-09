
import java.util.ArrayList;
import java.util.Scanner;

public class mainHotel {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Quarto[] quartos = new Quarto[5];

        quartos[0] = new QuartoLuxo(101, 200);
        quartos[1] = new QuartoLuxo(102, 200);
        quartos[2] = new QuartoLuxo(103, 200);
        quartos[3] = new QuartoSimples(104, 100);
        quartos[4] = new QuartoSimples(105, 100);

        ArrayList<Hospede> clientes = new ArrayList<>();
        ArrayList<Hospedagem> hospedagens = new ArrayList<>();

        int opcao;

        do {

            System.out.println("\n----- MAPA DE QUARTOS -----");

            for (Quarto q : quartos) {
                System.out.println(
                        q.getNumero()
                        + (q.getIsOcupado() ? " [OCUPADO]" : " [LIVRE]"));
            }

            System.out.println("\n===== HOTEL =====");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Fazer Check-in");
            System.out.println("3 - Checkout");
            System.out.println("4 - Balanço de Caixa");
            System.out.println("5 - Encerrar Atendimento");
            System.out.print("Escolha: ");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Digite o nome do cliente: ");
                    String nome = teclado.nextLine();

                    System.out.print("Digite o CPF: ");
                    String cpf = teclado.nextLine();

                    clientes.add(new Hospede(nome, cpf));

                    System.out.println("Cliente cadastrado com sucesso!");
                    break;

                case 2:

                    if (clientes.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado.");
                        break;
                    }

                    System.out.println("\nClientes cadastrados:");

                    for (int i = 0; i < clientes.size(); i++) {
                        System.out.println(i + " - "
                                + clientes.get(i).getNome());
                    }

                    System.out.print("Digite o índice do cliente: ");
                    int cid = teclado.nextInt();

                    if (cid < 0 || cid >= clientes.size()) {
                        System.out.println("Cliente inválido.");
                        break;
                    }

                    System.out.print("Digite o número do quarto: ");
                    int nQuarto = teclado.nextInt();

                    System.out.print("Digite o número de diárias: ");
                    int nDiarias = teclado.nextInt();

                    boolean quartoEncontrado = false;

                    for (Quarto q : quartos) {

                        if (q.getNumero() == nQuarto) {

                            quartoEncontrado = true;

                            if (!q.getIsOcupado()) {

                                q.setIsOcupado(true);

                                hospedagens.add(
                                        new Hospedagem(
                                                q,
                                                clientes.get(cid),
                                                nDiarias));

                                System.out.println(
                                        "Hospedagem criada com sucesso!");
                            } else {
                                System.out.println("Quarto já está ocupado.");
                            }

                            break;
                        }
                    }

                    if (!quartoEncontrado) {
                        System.out.println("Quarto não encontrado.");
                    }

                    break;

                case 3:

                    System.out.print(
                            "Digite o número do quarto para checkout: ");

                    int nOut = teclado.nextInt();

                    boolean checkoutRealizado = false;

                    for (Hospedagem h : hospedagens) {

                        if (h.getQuarto().getNumero() == nOut
                                && h.getIsAtivo()) {

                            double total
                                    = h.getQuarto()
                                            .calcularTotal(h.getDiarias());

                            System.out.println(
                                    "Total a pagar: R$ " + total);

                            h.getQuarto().setIsOcupado(false);
                            h.setIsAtivo(false);
                            h.setvalorTotal(total);

                            checkoutRealizado = true;

                            System.out.println(
                                    "Checkout realizado com sucesso!");

                            break;
                        }
                    }

                    if (!checkoutRealizado) {
                        System.out.println(
                                "Nenhuma hospedagem ativa encontrada.");
                    }

                    break;

                case 4:

                    double totalCaixa = 0;

                    for (Hospedagem h : hospedagens) {

                        if (!h.getIsAtivo()) {
                            totalCaixa += h.getvalorTotal();
                        }
                    }

                    System.out.println(
                            "Balanço de caixa: R$ " + totalCaixa);

                    break;

                case 5:

                    System.out.println(
                            "Encerrando atendimento...");
                    break;

                default:

                    System.out.println("Opção inválida!");
            }

        } while (opcao != 5);

        teclado.close();
    }
}
