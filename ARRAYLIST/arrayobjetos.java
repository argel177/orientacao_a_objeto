
import java.util.ArrayList;

public class arrayobjetos {

    public static void main(String[] args) {
        ArrayList<String> produtos = new ArrayList<>();

        produtos.add("notebook");
        produtos.add("TV");
        produtos.add("Controle");

        produtos.remove(1);
        for (String item : produtos) {
            System.out.println(item);
        }
        System.out.println(produtos.size());
    }
}
