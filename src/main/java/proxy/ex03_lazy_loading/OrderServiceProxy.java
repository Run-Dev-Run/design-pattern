package proxy.ex03_lazy_loading;

public class OrderServiceProxy implements OrderService {

    private OrderService orderService;

    private void lazyInit() {
        if (orderService == null) {
            orderService = new BasicOrderService();
        }
    }

    @Override
    public void addProductInBucket(Product product) {
        lazyInit();

        System.out.println("장바구니에 넣기 - " + product.getName());
        orderService.addProductInBucket(product);
    }

    @Override
    public void placeOrder() {
        lazyInit();

        long before = System.currentTimeMillis();
        orderService.placeOrder();
        System.out.println("주문 처리 시간 = " + (System.currentTimeMillis() - before) + "초");
    }

}
