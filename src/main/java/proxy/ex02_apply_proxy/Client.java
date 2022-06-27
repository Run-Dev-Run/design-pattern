package proxy.ex02_apply_proxy;

public class Client {

    public static void main(String[] args) {
        Product product1 = new Product("맥북");
        Product product2 = new Product("키보드");
        Product product3 = new Product("마우스");

        OrderService orderService = new OrderServiceProxy(new BasicOrderService());
        orderService.addProductInBucket(product1);
        orderService.addProductInBucket(product2);
        orderService.addProductInBucket(product3);

        orderService.placeOrder();
    }

}
