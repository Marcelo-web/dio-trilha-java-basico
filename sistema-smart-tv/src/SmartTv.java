public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        if (ligada) {
            volume++;
            System.out.println("Aumentando o volume para " + volume);
        }
    }

    public void diminuirVolume() {
        if (ligada) {
            volume--;
            System.out.println("Diminuindo o volume para " + volume);
        }
    }

    public void aumentarCanal() {
        if (ligada) {
            canal++;
            System.out.println("Aumentando o canal para " + canal);
        }
    }

    public void diminuirCanal() {
        if (ligada) {
            canal--;
            System.out.println("Diminuindo o canal para " + canal);
        }
    }

    public void mudarCanal(int novoCanal) {
        if (ligada) {
            canal = novoCanal;
        }
    }
}
