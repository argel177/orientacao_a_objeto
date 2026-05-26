
public class mainRH {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Abenr", 2000);
        double bonus;

        bonus = f1.CalcularBonus();
        System.out.println("Bonus " + bonus);

        Gerente f2 = new Gerente("Bruno", 5000);
        bonus = f2.CalcularBonus();
        System.out.println("Bonus Gerente " + bonus);

    }
}
