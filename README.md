# Design Patterns

Em Engenharia de Software os _design patterns_ (padrões de projetos) são propostas/modelos utilizados para situações problemas que que ocorrem com bastante frequência no desenvolvimento de softwares baseados no paradigma de Programação Orientada à Objetos.

Estes padrões podem acelerar o processo de desenvolvimento, provendo paradigmas de desenvolvimento testados e comprovados.

O design efetivo de software requer a consideração de problemas que podem não se tornarem visíveis em um primeiro momento. A utilização de _design patterns_ ajuda a evitar estes problemas sutis que causam grandes impactos e também facilita a legibilidade do código.  

## Criação

Preocupam-se com o processo de criação de objetos:

- **_Factory Method_**: define uma interface para criar um objeto, mas deixa as subclasses decidirem qual classe instanciar,deixando a responsabilidade de instanciação para subclasses.
- **Abstract Factory**: provê uma interface para criar famílias de objetos relacionados ou inter-dependentes sem especificar suas classes concretas.
- **Builder**: separa a construção de um objeto complexo de sua representação, de modo que o mesmo processo possa criar representações diferentes.
- **Prototype**: especifica os tipos de objetos a serem criados utilizando uma instância protótipo e criando novos objetos copiando este protótipo.
- **Singleton**: garante que uma classe tenha somente uma instância e fornece um ponto de acesso global a ela.

## Estrutural

Lidam com a composição de classes ou objetos:

- **_Adapter_**: converte a interface de uma classe em outra interface com a qual os clientes estão prontos para lidar e permite que classes trabalhem conjuntamente apesar de interfaces incompatíveis.
- **Bridge**: desacopla uma abstração de sua implementação de forma que as duas possam mudar independente uma da outra.
- **Composite**: compõe objetos em estruturas de árvore para representar hierarquias Parte-Todo, e permite que clientes tratem objetos individuais e composições de objetos uniformemente.
- **Decorator**: atribui responsabilidades adicionais a um objeto dinamicamente, fornecem uma alternativa flexível a sub-classes para extensão de funcionalidade.
- **Facade**: provê uma interface unificada para um conjunto de interfaces num subsistema, define uma interface de mais alto nível, deixando o subsistema mais fácil de usar.
- **Flyweight**: usa o compartilhamento para dar suporte eficiente ao uso de um grande número de objetos de granularidade pequena.
- **Proxy**: provê um objeto procurador ou placeholder para um outro objeto para controlar o acesso a ele.

## Comportamental

Caracterizam as maneiras pelas quais classes ou objetos interagem e distribuem responsabilidades:

- **_Interpreter:_** dada uma linguagem, define uma representação de sua gramática e um interpretador que usa a representação da gramática para interpretar sentenças da linguagem.
- **_Template Method_** define o esqueleto de um algoritmo numa operação, deixando que subclasses completem algumas das etapas. Permite que subclasses redefinem determinadas etapas de um algoritmo sem alterar a estrutura do algoritmo.
- **Chain of Responsibility:** evitar o acoplamento entre remetente (quem deseja algo) de uma solicitação ao seu receptor (quem irá fazer algo), ao permitir que mais de um objeto tenha a oportunidade de manipular a solicitação através do encadeamento de objetos receptores, passando a solicitação através da cadeia até que algum objeto à trate.
- **Command:** evitar o acoplamento do remetente de uma solicitação ao seu receptor, ao dar a mais de um objeto a oportunidade de tratar a solicitação. Encadear os objetos receptores, passando a solicitação ao longo da cadeia até que um objeto a trate.
- **Iterator:** provê uma forma de acessar os elementos de uma coleção de objetos seqüencialmente sem expor sua representação subjacente.
- **Mediator:** definir um objeto que encapsula a forma como um conjunto de objetos interage. Promove o acoplamento fraco ao evitar que os objetos se refiram uns aos outros explicitamente e permitir variar suas interações independentemente.
- **Memento:** sem violar o encapsulamento, capturar e externalizar um estado interno de um objeto, de maneira que o objeto possa ser restaurado para esse estado mais tarde.
- **Observer:** definir uma dependência um para muitos entre objetos, de maneira que quando um objeto muda de estado todos os seus dependentes são notificados e atualizados automaticamente.
- **State:** permite a um objeto alterar seu comportamento quando seu estado interno muda. O objeto parecerá ter mudado de classe.
- **Strategy:** define uma família de algoritmos (ConcreteBehaviorA, ConcreteBehaviorB), encapsula cada uma e as torna intercambiáveis (IBehavior). Permite que o algoritmo varie independentemente dos clientes (Client) que o utilizam.
- **Visitor:** representar uma operação a ser executada nos elementos de uma estrutura de objetos. Permite definir uma nova operação sem mudar as classes dos elementos sobre os quais opera.

### Referências

- [Design Patterns in Object Oriented Programming - Christopher Okhravi @ Youtube](https://www.youtube.com/watch?v=v9ejT8FO-7I&list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc)
- [Design patterns implemented in Java - Iluwatar @ GitHub](https://github.com/iluwatar/java-design-patterns)