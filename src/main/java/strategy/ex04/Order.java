package strategy.ex04;

public class Order {

    private int totalAmount;

    private DiscountPolicy discountPolicy;

    public Order(int totalAmount, DiscountPolicy discountPolicy) {
        this.totalAmount = totalAmount;
        this.discountPolicy = discountPolicy;
    }

    public void placeOrder() {
        // 금액 합산
        calcTotalAmount();

        // 할인정책 적용 ( 변하는 부분 )
        totalAmount = discountPolicy.discountAmount(totalAmount);

        System.out.println("총 주문 금액 : " + totalAmount);
    }

    private void calcTotalAmount() {
        System.out.println("상품 금액 합계 : " + totalAmount);
    }

}
