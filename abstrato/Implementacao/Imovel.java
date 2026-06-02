
public class Imovel implements Tributavel {

    protected double valorVenal;

    public Imovel(double vv) {
        this.valorVenal = vv;
    }

    @Override
    public double CalcularImposto() {
        return this.valorVenal * 0.01;
    }
}
