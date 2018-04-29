package gof.estrutura.facade;

/**
 * @author gabriel.freitas
 */
public class SistemaAudio {

    public void configurarCanais() {
        System.out.println("[SistemaAudio] configurando canais");
    }

    public void configurarFrequencias() {
        System.out.println("[SistemaAudio] configurando frequências");
    }

    public void configurarVolume() {
        System.out.println("[SistemaAudio] configurando volume");
    }

    public void reproduzirAudio(String arquivo) {
        System.out.println(String.format("[SistemaAudio] reproduzindo %s", arquivo));
    }

}
