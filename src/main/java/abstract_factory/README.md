# Abstract Factory

# Abstract Factory Pattern

　

　

## 추상 팩토리 패턴이란

　

구체적인 클래스에 의존하지 않고 서로 연관되거나 의존적인 객체들의 조합을 만드는 인터페이스를 제공합니다.

　

쉽게 말해서, 관련성이 있는 여러 종류의 객체를 일관된 방식으로 생성하는 경우에 사용하기 적합합니다.

　

　

　

　

　

## 추상 팩토리 패턴 vs 팩토리 메서드 패턴

　

추상 팩토리 패턴과 팩토리 메서드 패턴을 착각하는 경우가 있습니다.

　

팩토리 메서드 패턴은 객체를 생성하는 부분을 팩토리 클래스로 위임하여 조건에 따라 객체를 생성할 수 있도록 합니다.

　

추상 팩토리 패턴 또한 팩토리 메서드 처럼 생성하는 부분을 팩토리 클래스로 위임합니다.

　

하지만, 팩토리 메서드와는 달리 관련성이 있는 여러 종류의 객체들을 추상화합니다.

　

쉽게 말해서, 팩토리 메서드 패턴의 팩토리 보다 큰 팩토리를 갖고 있다고 할 수 있습니다.

　

　

　

　

## 예제

　

가전 제품의 종류에는 TV, 냉장고, 세탁기, 스타일러 등 여러 가지가 있습니다. LG에는 오브제 컬렉션이 삼성에는 비스포크가 있습니다.

　

위의 주제를 통해서 추상 팩토리 패턴을 설명하도록 하겠습니다.

　

　

　

　

## Reference

- [Github - iluwater/java-design-patterns](https://github.com/iluwatar/java-design-patterns/tree/master/abstract-factory)
- [Baeldung - java-abstract-factory-pattern](https://www.baeldung.com/java-abstract-factory-pattern)