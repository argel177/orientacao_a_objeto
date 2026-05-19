
public class Produto {

    String nome;
    double preco;
    int QuantidadeEstoque;

    public void adicionarEstoque(int quantidade) {
        this.QuantidadeEstoque = this.QuantidadeEstoque + quantidade;

        System.out.println("estoque atualizado");
    }
}
