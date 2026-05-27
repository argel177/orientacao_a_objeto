
public class mainProduto {

    public static void main(String[] args) {

        Produto[] carrinho = new Produto[4];

        carrinho[0] = new Produto("Caneta", 5.00);
        carrinho[1] = new ProdutoDigital("Curso Online", 100.00);
        carrinho[2] = new ProdutoFisico("Geladeira", 3000.00, 50);
        carrinho[3] = new ProdutoPerecivel("Queijo", 40.00, 1, 2);

        double total = 0;

        for (Produto p : carrinho) {
            double valorFinal = p.calcularPrecoFinal();

            System.out.println("Produto: " + p.nome);
            System.out.println("Preço final: R$ " + valorFinal);
            total += valorFinal;
        }
        System.out.println("TOTAL A PAGAR: R$ " + total);
    }
}
