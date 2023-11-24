import java.util.Scanner;
import java.util.Locale;

public class AboutMe {
    public static void main(String []args){
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        

        System.out.println("Digite seu nome ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome ");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite sua idade ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura ");
        double altura = scanner.nextDouble();
        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola me chamo " + nome + " " + sobrenome);
        System.out.println("Minha idade é: " + idade);
        System.out.println("Minha altura é: " + altura);

    }
    
}
