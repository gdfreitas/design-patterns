package gof.estrutura.facade;

/**
 * @author gabriel.freitas
 */
public class SistemaFacade {

    protected SistemaAudio audio;
    protected  SistemaInput input;
    protected  SistemaVideo video;

    public void inicializarSubsistemas() {
        audio = new SistemaAudio();
        audio.configurarCanais();
        audio.configurarFrequencias();
        audio.configurarVolume();

        input = new SistemaInput();
        input.configurarKeyboard();
        input.configurarMesa();

        video = new SistemaVideo();
        video.configurarCores();
        video.configurarResolucao();
    }

    public void reproduzirAudio(String arquivo) {
        audio.reproduzirAudio(arquivo);
    }

    public void renderizarImagem(String imagem) {
        video.renderizarImagem(imagem);
    }

    public void lerInput() {
        input.lerInput();
    }

}
