package strategy.ex03;

public class PercentDiscountedOrder extends Order{

    private static final double DISCOUNT_PERCENT = 0.1;

    public PercentDiscountedOrder(int totalAmount) {
        super(totalAmount);
    }

    protected void discountAmount() {
        totalAmount = (int) (totalAmount - totalAmount*DISCOUNT_PERCENT);
    }

}
