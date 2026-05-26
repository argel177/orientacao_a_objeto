
public class mainEcommerce {

    public static void main(String[] args) {

        Produto p1 = new Produto("Livro", 100.0);
        ProdutoFisico p2 = new ProdutoFisico("Cadeira", 500.0);
        ProdutoDigital p3 = new ProdutoDigital("Curso", 200.0);

        System.out.println(p1.nome + " Preço Final: R$ " + p1.calcularPrecoFinal());
        System.out.println(p2.nome + " Preço Final: R$ " + p2.calcularPrecoFinal());
        System.out.println(p3.nome + " Preço Final: R$ " + p3.calcularPrecoFinal());
    }
}
