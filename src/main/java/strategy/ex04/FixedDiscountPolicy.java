package strategy.ex04;

public class FixedDiscountPolicy implements DiscountPolicy {

    private static final int DISCOUNT_FEE = 500;

    @Override
    public int discountAmount(int totalAmount) {
        return totalAmount -= DISCOUNT_FEE;
    }

}
