public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv stv = new SmartTv();
        
        System.out.println("TV ligada? : " + stv.ligada);
        System.out.println("Canal? : " + stv.canal);
        System.out.println("Volume? : " + stv.volume);

        stv.ligar();
        System.out.println("TV ligada? : " + stv.ligada);

        stv.aumentarVolume();
        stv.aumentarVolume();
        stv.aumentarVolume();
        stv.aumentarVolume();
        stv.diminuirVolume();
        System.out.println("Volume atual: " + stv.volume);

        stv.mudarCanal(13);
        System.out.println("Canal atual: " + stv.canal);
        stv.diminuirCanal();
        stv.diminuirCanal();
        System.out.println("Canal atual: " + stv.canal);

        stv.desligar();
        System.out.println("TV ligada: " + stv.ligada);
    }
}
