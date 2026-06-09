
public class mainMedia {

    public static void main(String[] args) {
        Aluno[] classe = new Aluno[4];
        classe[0] = new Aluno("Argel", 8, 7);
        classe[1] = new Aluno("Leonardo", 9, 7);
        classe[2] = new Aluno("Eliana", 10, 9);
        classe[3] = new Aluno("Dan", 5, 7);

        double somanotas = 0;

        for (Aluno a : classe) {
            somanotas += a.getMedia();
        }
        System.out.println(somanotas / classe.length);
    }

}
