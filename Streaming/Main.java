
public class Main {

    public static void main(String[] args) {

        Assinatura a1 = new Assinatura(19.90);
        AssinaturaPremium a2 = new AssinaturaPremium(39.90);

        System.out.println(a1.exibirBeneficios());
        System.out.println(a2.exibirBeneficios());
    }
}
  