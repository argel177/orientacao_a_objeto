
import java.util.ArrayList;

public class mainTarefa {

    public static void main(String[] args) {
        ArrayList<Tarefa> tf = new ArrayList<>();
        tf.add(new Tarefa("Estudar"));
        tf.add(new Tarefa("Programar"));
        tf.add(new Tarefa("Comer"));
        tf.add(new Tarefa("viajar"));

        tf.get(1).finalizarTarefa();
        System.out.println("tarefas pendendes");

        for (Tarefa item : tf) {
            if (!item.isConcluida()) {
                System.out.println("Faltam  " + item.getDescrição());
            }
        }

    }

}
