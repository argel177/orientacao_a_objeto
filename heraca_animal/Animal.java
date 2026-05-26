
public class Animal {

    protected int idade;
    protected String nome;

    public Animal(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public void dormir() {
        System.out.println("O animal está dormindo");
    }
}
