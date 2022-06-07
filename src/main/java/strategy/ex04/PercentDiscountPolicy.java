package strategy.ex04;

public class PercentDiscountPolicy implements DiscountPolicy {

    private static final double DISCOUNT_PERCENT = 0.1;

    @Override
    public int discountAmount(int totalAmount) {
        return (int) (totalAmount - totalAmount*DISCOUNT_PERCENT);
    }

}
