package gof.comportamento.iterator;

/**
 * @author gabriel.freitas
 */
public class CanaisEsporte extends AgregadoCanais {

    public CanaisEsporte() {
        canais.add(new Canal("Esporte ao vivo"));
        canais.add(new Canal("Basquete 2011"));
        canais.add(new Canal("Campeonato Italiano"));
        canais.add(new Canal("Campeonato Espanhol"));
        canais.add(new Canal("Campeonato Brasileiro"));
    }

}
