
public class mainIngresso {

    public static void main(String[] args) {
        Ingresso[] lista = new Ingresso[5];

        lista[0] = new Ingresso("Show de Stand up", 100.0);
        lista[1] = new IngressoMeia("Show de Rock", 100.0);
        lista[2] = new IngressoVIP("Show de Pop", 100.0);
        lista[3] = new Ingresso("Peça de Teatro", 80.0);
        lista[4] = new IngressoVIP("Festival", 150.0);

        double faturamentoTotal = 0;

        for (int i = 0; i < lista.length; i++) {

            System.out.println("\n=== Ticket " + (i + 1) + " ===");

            lista[i].imprimirTicket();

            faturamentoTotal += lista[i].calcularValorFinal();
        }

        System.out.println("Faturamento Total: R$ " + faturamentoTotal);
    }
}
