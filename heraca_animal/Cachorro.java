
public class Cachorro extends Animal {
    
    public Cachorro(int idade, String nome) {
        super(idade, nome);
    }   
    
    public void latir() {
        System.out.println(this.nome + " está latindo: Au Au!");
    }
}