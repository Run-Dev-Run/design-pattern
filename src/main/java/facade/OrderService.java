package facade;

public class OrderService {
    public String order(User user, Product product) {
        user.deductPoint(product.getPrice());
        product.decreaseStock();
        return OrderFactory.createOrder(user, product)
                           .getId();
    }
}
