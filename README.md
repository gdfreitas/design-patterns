# G.O.F Design Patterns

## Criação
Preocupam-se com o processo de criação de objetos:
- **_Factory Method_**: define uma interface para criar um objeto, mas deixa as subclasses decidirem qual classe instanciar, 
deixando a responsabilidade de instanciação para subclasses.
- **Abstract Factory**: provê uma interface para criar famílias de objetos relacionados ou inter-dependentes sem especificar 
suas classes concretas.
- **Builder**: separa a construção de um objeto complexo de sua representação, de modo que o mesmo processo possa criar representações diferentes.
- **Prototype**: especifica os tipos de objetos a serem criados utilizando uma instância protótipo e criando novos objetos copiando este protótipo.
- **Singleton**: garante que uma classe tenha somente uma instância e fornece um ponto de acesso global a ela.

## Estrutural
Lidam com a composição de classes ou objetos:
- **_Adapter_**: converte a interface de uma classe em outra interface com a qual os clientes estão prontos para lidar e permite que classes trabalhem 
conjuntamente apesar de interfaces incompatíveis.
- **Bridge**: desacopla uma abstração de sua implementação de forma que as duas possam mudar independente uma da outra.
- **Composite**: compõe objetos em estruturas de árvore para representar hierarquias Parte-Todo, e permite que clientes tratem 
objetos individuais e composições de objetos uniformemente.
- **Decorator**: atribui responsabilidades adicionais a um objeto dinamicamente, fornecem uma alternativa flexível a sub-classes 
para extensão de funcionalidade.
- **Facade**: provê uma interface unificada para um conjunto de interfaces num subsistema, define uma interface de mais alto nível, deixando o subsistema mais fácil de usar.
- **Flyweight**: usa o compartilhamento para dar suporte eficiente ao uso de um grande número de objetos de granularidade pequena.
- **Proxy**: provê um objeto procurador ou placeholder para um outro objeto para controlar o acesso a ele.

## Comportamental
Caracterizam as maneiras pelas quais classes ou objetos interagem e distribuem responsabilidades:
- **_Interpreter:_** dada uma linguagem, define uma representação de sua gramática e um interpretador que usa a representação da gramática para interpretar sentenças da linguagem.
- **_Template Method_** define o esqueleto de um algoritmo numa operação, deixando que subclasses completem algumas das etapas. Permite que subclasses redefinem determinadas etapas de um algoritmo sem alterar a estrutura do algoritmo.
- **Chain of Responsibility**: evitar o acoplamento entre remetente (quem deseja algo) de uma solicitação ao seu receptor (quem irá fazer algo),
ao permitir que mais de um objeto tenha a oportunidade de manipular a solicitação através do encadeamento de objetos receptores, 
passando a solicitação através da cadeia até que algum objeto à trate.
- **Command**: evitar o acoplamento do remetente de uma solicitação ao seu receptor, ao dar a mais de um objeto a oportunidade de tratar a solicitação. 
Encadear os objetos receptores, passando a solicitação ao longo da cadeia até que um objeto a trate.
- **Iterator**
- **Mediator**
- **Memento**
- **Observer**
- **State**
- **Strategy**
- **Visitor**