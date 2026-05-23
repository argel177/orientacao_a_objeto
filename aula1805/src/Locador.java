
public class Locador {

    private String modelo;
    private String marca;
    private int ano;
    private String cor;

    public Locador(String mod, String marc, int year, String color) {
        this.modelo = mod;
        this.marca = marc;
        this.ano = year;
        this.cor = color;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String novoModelo) {
        this.modelo = novoModelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String novaMarca) {
        this.marca = novaMarca;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String novaCor) {
        this.cor = novaCor;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int novoAno) {
        this.ano = novoAno;
    }
}
