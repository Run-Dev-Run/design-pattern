# Adapter pattern


　

![https://user-images.githubusercontent.com/58816862/176465682-87a01103-d295-45ff-960e-f5bf90b58868.png](https://user-images.githubusercontent.com/58816862/176465682-87a01103-d295-45ff-960e-f5bf90b58868.png)

　

어댑터 패턴은 서로 호환되지 않는 두 인터페이스를 사용할 수 있도록 해줍니다. 클래스의 인터페이스를 클라이언트가 원하는 다른 인터페이스로 변환합니다.

　

인터페이스를 사용자가 기대하는 다른 인터페이스로 변환하는 패턴으로, 호환성이 없는 인터페이스 때문에 함께 동작할 수 없는 클래스들이 함께 작동하도록 해줍니다.

　

쉽게 말해서, 메모리 카드에 사진이 몇 개 있고 이를 컴퓨터로 전송해야 한다고 생각해보겠습니다. 그것들을 전송하려면 메모리 카드를 컴퓨터에 연결할 수 있도록 컴퓨터 포트와 호환되는 일종의 어댑터가 필요합니다. 이 경우 카드 리더는 어댑터입니다.

　

또 다른 예로는 유명한 전원 어댑터가 있습니다. 세 다리 플러그는 두 갈래 콘센트에 연결할 수 없으며 두 갈래 콘센트와 호환되는 전원 어댑터를 사용해야 합니다.

　

또 다른 예는 한 사람이 말한 단어를 다른 사람에게 번역하는 번역가입니다.

　

　

　

　

## 관계도

　

![https://user-images.githubusercontent.com/58816862/176459871-b4e8462b-ff8a-4dff-9206-b69dcf314990.png](https://user-images.githubusercontent.com/58816862/176459871-b4e8462b-ff8a-4dff-9206-b69dcf314990.png)

　

### Target

　

- 새로이 사용될 코드
- Client가 직접적으로 사용하려고 하는 인터페이스를 정의합니다.
- Adaptee가 지원하길 바라는 인터페이스를 의미합니다.

　

　

### Adaptee

　

- 기존에 사용되고 있는 코드
- Adapter 에서 사용하고자 하는 인터페이스를 정의하고 있습니다.

　

　

### Adapter

　

- Target 인터페이스를 상속받아서 구현하는 클래스로 이 때 Adaptee의 함수를 사용하게 됩니다.

　

　

### Client

　

- Target 인터페이스를 사용한다.

　

　

　

　

## Object adapter, Class adapter

　

![https://user-images.githubusercontent.com/58816862/176461736-da9c1fa9-be30-45fa-94a0-64ea3e526176.png](https://user-images.githubusercontent.com/58816862/176461736-da9c1fa9-be30-45fa-94a0-64ea3e526176.png)

　

두 가지 방법을 사용한 예제는 [여기](https://github.com/leeheefull/blog-source/tree/main/design-pattern/src/main/java/com/leeheefull/adapter) 있습니다.

　

어댑터 패턴은 클래스 어댑터, 객체 어댑터 두 가지 방식으로 사용할 수 있습니다. 차이는 클래스 어댑터는 상속을 사용하고 객체 어댑터는 합성을 사용한다는 점입니다.

　

아래 다이어 그램을 확인해보면 결국 어댑터가 operation을 사용할 때, speicificOperation 함수를 호출하는데 이것이 내부의 객체로 오는지 상속을 통해서 오는지의 차이가 있을 뿐입니다.

　

　

　

　

## 장단점

　

### 장점

　

- SOLID 중 OCP를 따릅니다.
- Adapter 패턴의 가장 큰 장점을 기존 코드를 변경하지 않아도 된다는 점입니다.
- 기존 코드를 변경하지 않기 때문에 클래스 재활용성을 증가시킬 수 있습니다.

　

　

### 단점

　

- 구성요소를 위해 클래스를 증가시켜야 하기 때문에 복잡도가 증가할 수 있습니다.
- 클래스 Adapter 의 경우 상속을 사용하기 때문에 유연하지 못합니다.
- 반면, 객체 Adapter 의 경우는 대부분의 코드를 다시 작성해야 하기 때문에 효율적이지 못합니다.

　

　

　

　

## 간단한 예제

　

오브젝트 어댑터 방식을 사용한 간단한 예제는 [여기](https://github.com/leeheefull/blog-source/tree/main/design-pattern/src/main/java/com/leeheefull/adapter/example) 있습니다.

　

　

　

　

## 실제 사례

　

어댑터 패턴의 실제 사용 사례는 정말 굉장히 많지만, 저는 그 중에서도 Spring security로 설명하겠습니다.

　

![https://user-images.githubusercontent.com/58816862/176464313-d6c8463e-bbe8-4a61-9357-fbda41f6d8c4.png](https://user-images.githubusercontent.com/58816862/176464313-d6c8463e-bbe8-4a61-9357-fbda41f6d8c4.png)

　

스프링 시큐리티를 사용하기 위해서는 WebSecurityConfigurerAdapter 상속한 SecurityConfig를 생성하고 configure(HttpSecurity http) 메서드를 오버라이드하여 설정해야 합니다.

　

이는 어댑터 패턴의 오브젝트 방식을 사용한 예제입니다. WebSecurityConfigurerAdapter는 HttpSecurity의 보안 기능을 사용할 수 있도록 어댑터 역할을 해줍니다.

　

SecurityConfig는 Target이 되고, HttpSecurity는 Adaptee 이며, WebSecurityConfigurerAdapter는 Adapter가 되겠습니다.

　

　

　

　

## Reference

　

- [github  |  iluwatar  |  java-design-pattern](https://github.com/iluwatar/java-design-patterns)
- [kscory blog  |  [Design Pattern] Adapter 패턴](https://kscory.com/dev/design-pattern/adapter)