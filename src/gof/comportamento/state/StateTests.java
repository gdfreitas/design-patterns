package gof.comportamento.state;

/**
 * @author gabriel.freitas
 */
public class StateTests {

    public static void main(String[] args) {
        Mario mario = new Mario();
        mario.pegarCogumelo();
        mario.pegarPena();
        mario.levarDano();
        mario.pegarFlor();
        mario.pegarFlor();
        mario.levarDano();
        mario.levarDano();
        mario.pegarPena();
        mario.levarDano();
        mario.levarDano();
        mario.levarDano();
    }

}
