
public class Gato extends Animal {

    public Gato(int idade, String nome) {
        super(idade, nome);
    }

    public void miar() {
        System.out.println(this.nome + " está miando: Miau!");
    }
}
