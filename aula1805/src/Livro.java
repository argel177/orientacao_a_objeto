
public class Livro {

    String titulo;
    String autor;
    boolean disponivel;

    public void emprestar() {
        if (this.disponivel == true) {
            this.disponivel = false;
            System.out.println("emprestimo realizado");
        } else {
            System.out.println("Livro indsiponível");
        }
    }

    public void devolver() {
        this.disponivel = true;
        System.out.println("livro devolvido");
    }

}
