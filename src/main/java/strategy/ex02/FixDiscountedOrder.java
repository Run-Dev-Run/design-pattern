package strategy.ex02;

public class FixDiscountedOrder {
    private static final int DISCOUNT_FEE = 500;;

    private int totalAmount;

    public FixDiscountedOrder(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void placeOrder() {

        // 금액 합산
        calcTotalAmount();

        // 할인정책 적용
        discountAmount();

        System.out.println("총 주문 금액 : " + totalAmount);
    }

    private void calcTotalAmount() {
        System.out.println("상품 금액 합계 : " + totalAmount);
    }

    private void discountAmount() {
        totalAmount -= DISCOUNT_FEE;
    }

}
