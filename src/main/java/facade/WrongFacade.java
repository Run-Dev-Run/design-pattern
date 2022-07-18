package facade;

public class WrongFacade implements OrderService {

    @Override
    public String order(User user, Product product) {
        deductPoints(user, product.getPrice());
        decreaseStock(product);
        return new Order(user, product).getId();
    }

    private void deductPoints(User user, int points) {
        if (points > user.getPoints()) {
            throw new RuntimeException("포인트가 부족 합니다.");
        }
        user.setPoints(user.getPoints() - points);
    }

    private void decreaseStock(Product product) {
        if (product.getStock() <= 0) {
            throw new RuntimeException("재고가 없습니다.");
        }
        product.decreaseStock();
    }
}
