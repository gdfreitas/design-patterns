package gof.estrutura.adapter;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class AdapterTests {

    public static void main(String[] args) {

        ImagemTarget imagem = new ImagemPngAdapter();
        imagem.carregar("floresta.png");
        imagem.desenhar(5, 10, 0, 0);

    }

}
