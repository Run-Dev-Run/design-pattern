package proxy.ex02_apply_proxy;

public class OrderServiceProxy implements OrderService{

    private final OrderService orderService;

    public OrderServiceProxy(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void addProductInBucket(Product product) {
        System.out.println("장바구니에 넣기 - " + product.getName());
        orderService.addProductInBucket(product);
    }

    @Override
    public void placeOrder() {
        long before = System.currentTimeMillis();
        orderService.placeOrder();
        System.out.println("주문 처리 시간 = " + (System.currentTimeMillis() - before) + "초");
    }

}
