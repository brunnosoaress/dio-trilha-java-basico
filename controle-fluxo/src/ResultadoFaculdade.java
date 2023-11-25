public class ResultadoFaculdade {
    public static void main(String[] args) {
        int nota = 8;

        if (nota >= 7) {
            System.out.println("Você está aprovado");
        }else if (nota >= 5 && nota < 7) {
            System.out.println("Você está de recuperação");
        }else {
            System.out.println("Você está reprovado");
        }
    }
}
