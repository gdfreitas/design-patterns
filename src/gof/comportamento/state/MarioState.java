package gof.comportamento.state;

/**
 * @author gabriel.freitas
 */
public interface MarioState {

    MarioState pegarCogumelo();

    MarioState pegarFlor();

    MarioState pegarPena();

    MarioState levarDano();

}
