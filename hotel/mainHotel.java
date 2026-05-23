
import java.util.Scanner;

public class mainHotel {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Quarto[] quartos = new Quarto[10];

        for (int i = 0; i < quartos.length; i++) {
            quartos[i] = new Quarto(101 + i, "Simples");
        }

        double faturamentoTotal = 0;
        int opcao;

        do {
            System.out.println("\n===== HOTEL =====");
            System.out.println("1 - Mapa de Quartos");
            System.out.println("2 - Fazer Check-in");
            System.out.println("3 - Fazer Check-out");
            System.out.println("4 - Buscar Hóspede");
            System.out.println("5 - Encerrar Atendimento");
            System.out.print("Escolha: ");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {

                case 1:

                    System.out.println("\n--- MAPA DE QUARTOS ---");

                    for (Quarto q : quartos) {

                        if (q.getHospedeAtual() == null) {
                            System.out.println("Quarto " + q.getNumero() + " - Livre");
                        } else {
                            System.out.println("Quarto " + q.getNumero()
                                    + " - Ocupado por "
                                    + q.getHospedeAtual().getNome());
                        }
                    }

                    break;

                case 2:

                    System.out.print("Número do quarto: ");
                    int numeroCheckIn = teclado.nextInt();
                    teclado.nextLine();

                    Quarto quartoCheckIn = null;

                    for (Quarto q : quartos) {
                        if (q.getNumero() == numeroCheckIn) {
                            quartoCheckIn = q;
                            break;
                        }
                    }

                    if (quartoCheckIn != null) {

                        if (quartoCheckIn.getHospedeAtual() == null) {

                            System.out.print("Nome: ");
                            String nome = teclado.nextLine();

                            System.out.print("CPF: ");
                            String cpf = teclado.nextLine();

                            System.out.print("Telefone: ");
                            String telefone = teclado.nextLine();

                            System.out.print("Quantidade de dias: ");
                            int dias = teclado.nextInt();
                            teclado.nextLine();

                            Hospede hospede
                                    = new Hospede(nome, cpf, telefone);

                            quartoCheckIn.checkIn(hospede, dias);

                            System.out.println("Check-in realizado!");

                        } else {
                            System.out.println("Quarto já ocupado!");
                        }

                    } else {
                        System.out.println("Quarto não encontrado!");
                    }

                    break;

                case 3:

                    System.out.print("Número do quarto: ");
                    int numeroCheckOut = teclado.nextInt();
                    teclado.nextLine();

                    Quarto quartoCheckOut = null;

                    for (Quarto q : quartos) {
                        if (q.getNumero() == numeroCheckOut) {
                            quartoCheckOut = q;
                            break;
                        }
                    }

                    if (quartoCheckOut != null) {

                        if (quartoCheckOut.getHospedeAtual() != null) {

                            double valor = quartoCheckOut.checkOut();

                            faturamentoTotal += valor;

                            System.out.println("Total a pagar: R$ " + valor);

                        } else {
                            System.out.println("Quarto já está livre!");
                        }

                    } else {
                        System.out.println("Quarto não encontrado!");
                    }

                    break;

                case 4:

                    System.out.print("Nome do hóspede: ");
                    String busca = teclado.nextLine();

                    boolean encontrado = false;

                    for (Quarto q : quartos) {

                        if (q.getHospedeAtual() != null) {

                            if (q.getHospedeAtual().getNome()
                                    .equalsIgnoreCase(busca)) {

                                System.out.println("\nHóspede encontrado!");
                                System.out.println("Quarto: " + q.getNumero());
                                System.out.println("Telefone: "
                                        + q.getHospedeAtual().getTelefone());

                                encontrado = true;
                            }
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Hóspede não encontrado!");
                    }

                    break;

                // ENCERRAR
                case 5:

                    System.out.println("\nEncerrando Atendimento...");
                    System.out.println("Faturamento total: R$ "
                            + faturamentoTotal);

                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 5);

        teclado.close();
    }
}
