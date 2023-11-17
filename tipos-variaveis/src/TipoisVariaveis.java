public class TipoisVariaveis {
    public static void main(String[] args) throws Exception {
        //tipos primitivos
        //String que representa texto na aplicação

        String meuNome = "Bruno Araújo";

        int idade = 21;

        short numeroCurto = 10;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        System.out.println(meuNome);

        System.out.println(numeroNormal);

        final double SALARIO_MINIMO = 2500;

        System.out.println(SALARIO_MINIMO);
        
    }
}
