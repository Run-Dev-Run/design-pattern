
## **프록시(Proxy) 패턴**

---

![https://images.velog.io/images/devrunner21/post/7935920b-9c7a-4304-ae0e-0a06a6df1909/image.png](https://images.velog.io/images/devrunner21/post/7935920b-9c7a-4304-ae0e-0a06a6df1909/image.png)

출처 : [https://limkydev.tistory.com/79](https://limkydev.tistory.com/79)

- Proxy는 우리말로 "대변인" 이라는 뜻
- 클라이언트의 요청이 오면
    1. Proxy객체가 먼저 이 요청을 받고
    2. 요청에 필요한 객체의 메서드( RealSubject.request() )를 대신 호출하여
    3. 반환된 값을 반환한다.

### 장점

- 실제 객체를 사용하기 전에 전처리 작업이 가능함 ( 로깅, 캐싱 등등 )
- 객체의 초기화를 사용 직전까지 지연 시킬 수 있다. ( LazyLoading )
- 실제 객체를 수정하지 않고 추가기능을 삽입 할 수 있음
- 실제 객체에 접근하기 전에 접근권한을 판단하고 이에 대한 접근제어가 가능함

### 단점

- 코드가 복잡해진다.
- 여러 객체를 거치기 때문에 속도가 느려 질 수 있다.

### 주의사항

<aside>
🗣️ 프록시 객체는 흐름제어만 할 뿐 결과값을 조작하거나 변경시키면 안됩니다.

</aside>

## 예제

---

### Ex01. 기본 시나리오

![Untitled](https://user-images.githubusercontent.com/78334008/173556306-cb84a1aa-63ac-4fae-b3a6-508c91f81f8f.png)

- 상품을 장바구니에 담고 주문서비스를 통해 상품을 주문한다.

    ```java
    public class Client {
    
        public static void main(String[] args) {
            Product product1 = new Product("맥북");
            Product product2 = new Product("키보드");
            Product product3 = new Product("마우스");
    
            BasicOrderService orderService = new BasicOrderService();
            
    				// 장바구니 담기
    				orderService.addProductInBucket(product1);
            orderService.addProductInBucket(product2);
            orderService.addProductInBucket(product3);
    
    				// 주문하기
            orderService.placeOrder();
        }
    
    }
    ```


### Ex2. 프록시 패턴 적용

- Ex01에서 아래와 같은 요구사항이 추가된다.
    - 장바구니에 담는 상품 정보를 로깅하고 싶다는 요구사항이 추가된다.
    - 주문 시 주문처리 시간을 로깅해 달라는 요구사항이 추가된다.
- 현재 운영중인 `BasicOrderService` 에 로깅기능을 추가한다면 소스의 수정이 발생하게 된다.
- 이를 프록시 패턴을 적용해서 해결해보자

![Untitled](https://user-images.githubusercontent.com/78334008/173556417-bc044778-0681-4b05-91cd-4ee04aa2cd08.png)

- 주요 기능을 추상화한 인터페이스를 만든다.

    ```java
    public interface OrderService {
    
        void addProductInBucket(Product product);
    
        void placeOrder();
    
    }
    ```


- Proxy 객체를 만든 후 OrderService인터페이스를 구현한다.
  Proxy 객체에서 본 객체의 호출전후 처리할 작업이나 접근제어를 담당한다.
  여기서는 장바구니 담기에 대한 로깅, 주문 프로세스 시간 로깅을 진행하였다.

    ```java
    public class OrderServiceProxy implements OrderService{
    
        private final OrderService orderService;
    
        public OrderServiceProxy(OrderService orderService) {
            this.orderService = orderService;
        }
    
        @Override
        public void addProductInBucket(Product product) {
            System.out.println("장바구니에 넣기 - " + product.getName());
            orderService.addProductInBucket(product);
        }
    
        @Override
        public void placeOrder() {
            long before = System.currentTimeMillis();
            orderService.placeOrder();
            System.out.println("주문 처리 시간 = " + (System.currentTimeMillis() - before) + "초");
        }
    
    }
    ```


<aside>
🗣️ 로깅 기능을 추가 하며 본 비즈니스 로직이었던 BasicOrderService는 하나도 수정하지 않았다.

이렇듯 프록시 패턴을 사용한다면 기존 코드의 수정 없이
새로운 기능 추가가 가능하다는 장점이 있다.

</aside>

### Ex03, LazyLoading 적용

- 만약 `BasicOrderService` 객체의 생성에 많은 리소스가 들어서 생성에 시간이 오래걸린 다는 시나리오를 추가한다.

    ```java
    public class BasicOrderService implements OrderService {
    
        private List<Product> bucket = new ArrayList<>();
    
        public BasicOrderService() {
            // 리소스 소모가 큰 작업이라고 가정한다.
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    
        public void addProductInBucket(Product product) {
            bucket.add(product);
        }
    
        public void placeOrder() {
            System.out.println("주문이 완료되었습니다.");
        }
    
    }
    ```

- 이 경우 Proxy 객체를 통해 해당 객체의 초기화를 사용 직전까지 늦출 수 있다.
  이를 LazyLoading이라고 한다.
