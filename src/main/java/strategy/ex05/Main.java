package strategy.ex05;

public class Main {

    public static void main(String[] args) {
        // 익명함수로 콜백 메서드를 정의한다.
        Order order = new Order(20000);

        order.placeOrder(totalAmount -> totalAmount - 1000);
    }

}
