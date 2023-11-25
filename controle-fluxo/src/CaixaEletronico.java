public class CaixaEletronico {
    public static void main(String[] args){
        double saldoConta = 40;
        double valorSolicitado = 50;

        if (valorSolicitado <= saldoConta) {
            saldoConta = saldoConta - valorSolicitado;
        }

        System.out.println(saldoConta);

    }
}
