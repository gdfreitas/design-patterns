# G.O.F Design Patterns

## Criação
Preocupam-se com o processo de criação de objetos:
* **Factory Method**: define uma interface para criar um objeto, mas deixa as subclasses decidirem qual classe instanciar, 
deixando a responsabilidade de instanciação para subclasses.
- Abstract Factory
- Builder
- Prototype
- Singleton

## Estrutural
Lidam com a composição de classes ou objetos:
* **Class Adapter**
- Object Adapter
- Bridge
- Composite
- Decorator
- Facade
- Flyweight
- Proxy

## Comportamental
Caracterizam as maneiras pelas quais classes ou objetos interagem e distribuem responsabilidades:
* **Interpreter**
* **Template Method**
- Chain of Responsibility: evitar o acoplamento entre remetente (quem deseja algo) de uma solicitação ao seu receptor (quem irá fazer algo),
ao permitir que mais de um objeto tenha a oportunidade de manipular a solicitação através do encadeamento de objetos receptores, 
passando a solicitação através da cadeia até que algum objeto à trate.

- Command: evitar o acoplamento do remetente de uma solicitação ao seu receptor, ao dar a mais de um objeto a oportunidade de tratar a solicitação. 
Encadear os objetos receptores, passando a solicitação ao longo da cadeia até que um objeto a trate.
- Iterator
- Mediator
- Memento
- Observer
- State
- Strategy
- Visitor

### Escopos
**Classe** e _Objeto_
