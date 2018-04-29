package gof.estrutura.flyweight;

/**
 * @author gabriel.freitas
 */
public class Imagem {

    protected String nome;

    public Imagem(String nome) {
        this.nome = nome;
    }

    public void desenhar() {
        System.out.println(nome + " desenhada!");
    }

}
