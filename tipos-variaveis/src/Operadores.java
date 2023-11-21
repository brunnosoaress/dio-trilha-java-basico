public class Operadores {
    public static void main(String[] args){
        String nomeUm = "Bruno";
        String nomeDois = new String("Bruno");

        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2){
            System.out.println("A condição é verdadeira");
        }
        
        System.out.println("numeroUm é igual numeroDois ? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroDois ? " + simNao);

        simNao = numero1 < numero2;

        System.out.println("numeroUm é menor que numeroDois ? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois ? " + simNao);

    }
}
