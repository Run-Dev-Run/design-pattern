### State Pattern 상태 패턴
> 각각의 상태에 따라 분기되어 처리되는 로직을 간결하게 구성할 수 있다.
> 각각의 상태에 따라 서로 다른 비즈니스로직이 제공될 때 해당 디자인패턴이 유용합니다.


### Buntalk Example
1. buntalk class는 EventState만을 알고 있는다.
2. EventState에서는 이벤트 참가와, 제공 메서드가 존재한다.
3. buntalk에 사용자의 상태를 추가하게 되면, 해당 상태에 맞춰 내가 원하는 비즈니스 로직이 실행된다.

### Question
1. state 패턴을 사용하게 되면, 기존 로직보다 관리해야 될 클래스가 더 많아지게 될 것입니다. 관리 포인트가 많아지는 것보다 state패턴을 쓰는게 더 이로울 까요?
2. state 패턴을 언제 사용해야 효율적일까요? 본인이 생각하기에 state패턴을 적요하기 알맞은 상황은 무엇인가요?
3. state 패턴을 사용한 예는 무엇이 있을까?
  - [JDBC setAutoCommit](https://docs.oracle.com/javase/7/docs/api/java/sql/Connection.html#setAutoCommit(boolean))
