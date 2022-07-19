package facade;

public class OrderFactory {
    private OrderFactory() {
    }

    public static Order createOrder(User user, Product product) {
        return new Order(user, product);
    }
}
