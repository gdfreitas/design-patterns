package gof.estrutura.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gabriel.freitas
 */
public class FlyweightFactory {

    protected List<SpriteFlyweight> flyweights;

    public FlyweightFactory() {
        flyweights = new ArrayList<>();
        flyweights.add(new Sprite("jogador.png"));
        flyweights.add(new Sprite("inimigo1.png"));
        flyweights.add(new Sprite("inimigo2.png"));
        flyweights.add(new Sprite("inimigo3.png"));
        flyweights.add(new Sprite("cenario1.png"));
        flyweights.add(new Sprite("cenario2.png"));
    }

    public SpriteFlyweight getFlyweight(Sprites jogador) {
        switch (jogador) {
            case JOGADOR:
                return flyweights.get(0);
            case INIMIGO_1:
                return flyweights.get(1);
            case INIMIGO_2:
                return flyweights.get(2);
            case INIMIGO_3:
                return flyweights.get(3);
            case CENARIO_1:
                return flyweights.get(4);
            case CENARIO_2:
                return flyweights.get(5);
        }

        return null;
    }

    public enum Sprites {
        JOGADOR, INIMIGO_1, INIMIGO_2, INIMIGO_3, CENARIO_1, CENARIO_2
    }

}
