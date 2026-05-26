
public class MainPet {

    public static void main(String[] args) {
        Gato meuGato = new Gato(3, "Green");
        Cachorro meuDog = new Cachorro(10, "Spike");

        meuGato.miar();
        meuDog.latir();

        meuGato.dormir();
        meuDog.dormir();
    }
}
