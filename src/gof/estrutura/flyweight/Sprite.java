package gof.estrutura.flyweight;

/**
 * @author gabriel.freitas
 */
public class Sprite extends SpriteFlyweight {

    protected Imagem imagem;

    public Sprite(final String nomeImagem) {
        this.imagem = new Imagem(nomeImagem);
    }

    @Override
    public void desenhar(final Ponto ponto) {
        imagem.desenhar();
        System.out.println(String.format("No ponto (%s, %s)", ponto.x, ponto.y));
    }
}
