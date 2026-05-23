
public class biblioteca {

    public static void main(String[] args) {

        Livro livro1 = new Livro();

        livro1.titulo = "Harry Potter 1";
        livro1.autor = "J. K. Rowling";
        livro1.disponivel = true;

        livro1.emprestar();
        livro1.emprestar();
        livro1.devolver();
    }

}
