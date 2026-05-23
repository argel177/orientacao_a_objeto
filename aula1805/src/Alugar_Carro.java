
public class Alugar_Carro {

    public static void main(String[] args) {
        Locador carro1 = new Locador("onix", "GM", 2018, "prata");
        carro1.setAno(2025);
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getAno());
        System.out.println(carro1.getMarca());

    }

}
