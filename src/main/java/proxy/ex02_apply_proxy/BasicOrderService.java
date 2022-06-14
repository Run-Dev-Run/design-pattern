package proxy.ex02_apply_proxy;

import java.util.ArrayList;
import java.util.List;

public class BasicOrderService implements OrderService {

    private List<Product> bucket = new ArrayList<>();

    public BasicOrderService() {
    }

    public void addProductInBucket(Product product) {
        bucket.add(product);
    }

    public void placeOrder() {
//        if (bucket == null) {
//            System.out.println("장바구니가 비었습니다.");
//            return;
//        }
        System.out.println("주문이 완료되었습니다.");
    }


}
