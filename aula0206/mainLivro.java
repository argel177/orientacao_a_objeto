
public class mainLivro {

    public static void main(String[] args) throws Exception {
        Livro[] estante = new Livro[3];

        estante[0] = new Livro("Harry Potter", "J.K. Rowling");
        estante[1] = new Livro("O codigo da Vince", "Dan Brown");
        estante[2] = new Livro("Arte da Guerra", "Sun Izu");

        for (int i = 0; i < estante.length; i++) {
            System.out.println(estante[i].getTitulo());
        }

        // ou usar esse for
        for (Livro l : estante) {
            System.out.println(l.getTitulo());
        }

    }

}
