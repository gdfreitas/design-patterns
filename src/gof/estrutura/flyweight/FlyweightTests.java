package gof.estrutura.flyweight;

/**
 * @author gabriel.freitas
 */
public class FlyweightTests {

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        factory.getFlyweight(FlyweightFactory.Sprites.CENARIO_1).desenhar(new Ponto(0, 0));
        factory.getFlyweight(FlyweightFactory.Sprites.JOGADOR).desenhar(new Ponto(10, 10));
        factory.getFlyweight(FlyweightFactory.Sprites.INIMIGO_1).desenhar(new Ponto(100, 10));
        factory.getFlyweight(FlyweightFactory.Sprites.INIMIGO_1).desenhar(new Ponto(120, 10));
        factory.getFlyweight(FlyweightFactory.Sprites.INIMIGO_1).desenhar(new Ponto(140, 10));
        factory.getFlyweight(FlyweightFactory.Sprites.INIMIGO_2).desenhar(new Ponto(60, 10));
        factory.getFlyweight(FlyweightFactory.Sprites.INIMIGO_2).desenhar(new Ponto(50, 10));
        factory.getFlyweight(FlyweightFactory.Sprites.INIMIGO_3).desenhar(new Ponto(170, 10));
    }

}
