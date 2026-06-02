
public class AssinaturaPremium extends Assinatura {

    public AssinaturaPremium(double p) {
        super(p);
    }

    @Override
    public String exibirBeneficios() {
        return "filme em HD + 4K + sem anúncios";
    }
}
