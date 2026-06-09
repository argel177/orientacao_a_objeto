
import java.util.ArrayList;
import java.util.Scanner;

public class mainAgenda {

    public static void main(String[] args) {
        ArrayList<Contato> agenda = new ArrayList<>();
        agenda.add(new Contato("Argel", "44759559"));
        agenda.add(new Contato("Joao", "58888789"));
        agenda.add(new Contato("Luiz", "47998855"));
        agenda.add(new Contato("Felis", "47855588"));

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome a ser buscado");
        String nomeBuscado = teclado.nextLine();

        boolean encontrado = false;

        for (Contato item : agenda) {
            if (item.getNome().equals(nomeBuscado)) {
                System.out.println("telefone" +);
            }
        }

    }

}
