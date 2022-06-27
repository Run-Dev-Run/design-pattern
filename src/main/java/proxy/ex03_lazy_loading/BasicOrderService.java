package proxy.ex03_lazy_loading;

import java.util.ArrayList;
import java.util.List;

public class BasicOrderService implements OrderService {

    private List<Product> bucket = new ArrayList<>();

    public BasicOrderService() {
        // 리소스 소모가 큰 작업이라고 가정한다.
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void addProductInBucket(Product product) {
        bucket.add(product);
    }

    public void placeOrder() {
        System.out.println("주문이 완료되었습니다.");
    }

}
