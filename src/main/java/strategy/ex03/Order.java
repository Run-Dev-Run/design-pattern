package strategy.ex03;

public abstract class Order {

    protected int totalAmount;

    public Order(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void placeOrder() {

        // 금액 합산
        calcTotalAmount();

        // 할인정책 적용 ( 변하는 부분 )
        discountAmount();

        System.out.println("총 주문 금액 : " + totalAmount);
    }

    private void calcTotalAmount() {
        System.out.println("상품 금액 합계 : " + totalAmount);
    }

    protected abstract void discountAmount();

}
