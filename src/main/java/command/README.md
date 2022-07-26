# Command Pattern

> 행위를 실행하라!라고 명령하는 패턴

### Command 패턴을 사용하는 이유

새로운 기능이 추가될 때 마다, 여러 연관관계와 의존성이 계속 높아진다. 결국에는 OCP의 원칙이 깨진다.
이런 문제를 Command 패턴을 통해 해결할 수 있다.


### 다이어그램

<img width="697" alt="image" src="https://user-images.githubusercontent.com/50691225/180972915-c7771561-8848-4fbe-857f-dc17f74516e8.png">

### Command 패턴을 사용한 자바 클래스

[Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)
[Action](https://docs.oracle.com/javase/8/docs/api/javax/swing/Action.html)
