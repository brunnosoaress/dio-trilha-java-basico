public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal atual ? " + smartTv.canal);
        System.out.println("Volume atual ? " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Novo status -> TV ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> TV ligada ? " + smartTv.ligada);
        
        smartTv.mudarCanal(18);
        System.out.println("Canal atual ? " + smartTv.canal);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual ? " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume atual ? " + smartTv.volume);

    }
}
