
public class mainSalario {

    public static void main(String[] args) {
        Vendedor v1 = new Vendedor("Argel", 2000);
        Gerente g1 = new Gerente("aa", 2000);
        System.out.println("salario do " + v1.calcularSalario());
        System.out.println("salario gerente " + g1.calcularSalario());

    }
}
