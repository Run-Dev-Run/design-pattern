package facade;

public class OrderFacade {
    public String order(User user, Product product) {
        user.deductPoints(product.getPrice());
        product.decreaseStock();
        return OrderFactory.createOrder(user, product)
                           .getId();
    }
}
