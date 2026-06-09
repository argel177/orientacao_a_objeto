
public class Aluno {

    private String nome;
    private double p1;
    private double p2;

    public Aluno(String n, double p1, double p2) {
        this.nome = n;
        this.p1 = p1;
        this.p2 = p2;
    }

    public double getMedia() {
        return ((this.p1 + this.p2) / 2);
    }
}
