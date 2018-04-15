package gof.estrutura.adapter;

/**
 * @author gabriel.freitas
 */
public interface ImagemTarget {

    void carregar(String arquivo);

    void desenhar(int posX, int posY, int largura, int altura);

}
