
import java.util.ArrayList;

public class mainMusica {

    public static void main(String[] args) {
        ArrayList<Musica> musicas = new ArrayList<>();

        musicas.add(new Musica("Depois", "Marisa Monte"));
        musicas.add(new Musica("Bandaids", "KP"));
        musicas.add(new Musica("Amanhã", "DE"));

        for (Musica item : musicas) {
            System.out.println("tocando " + item.getArtista() + " e  a musica " + item.getTitulo());

        }
    }
}
