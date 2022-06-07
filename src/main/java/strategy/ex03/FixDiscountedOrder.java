package strategy.ex03;

public class FixDiscountedOrder extends Order{
    private static final int DISCOUNT_FEE = 500;;

    public FixDiscountedOrder(int totalAmount) {
        super(totalAmount);
    }

    protected void discountAmount() {
        totalAmount -= DISCOUNT_FEE;
    }

}
