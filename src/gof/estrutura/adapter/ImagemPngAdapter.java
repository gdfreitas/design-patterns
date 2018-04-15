package gof.estrutura.adapter;

/**
 * @author gabriel.freitas
 */
public class ImagemPngAdapter extends ImagemPng implements ImagemTarget {

    @Override
    public void carregar(final String arquivo) {
        this.carregarImagemPng(arquivo);
    }

    @Override
    public void desenhar(final int posX, final int posY, final int largura, final int altura) {
        this.desenharImagemPng(posX, posY);
    }

}
