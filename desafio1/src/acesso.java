
public class acesso {

    public static void main(String[] args) throws Exception {

        Produto p1 = new Produto();
        p1.nome = "notebook";
        p1.preco = 2500.00;
        p1.QuantidadeEstoque = 2;

        Produto p2 = new Produto();
        p2.nome = "mouse";
        p2.preco = 25.00;
        p2.QuantidadeEstoque = 100;

        System.out.println("a quantidade de " + p1.nome + "é de " + p1.QuantidadeEstoque);
        System.out.println("o valor do estoque é " + (p1.QuantidadeEstoque * p1.preco) + " R$");

        p1.adicionarEstoque(15);
        System.out.println("quantidade de estoque 1 é " + p1.QuantidadeEstoque);
    }
}
