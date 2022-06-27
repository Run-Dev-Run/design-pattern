package proxy.ex01;

import java.util.ArrayList;
import java.util.List;

public class BasicOrderService {

    private List<Product> bucket = new ArrayList<>();

    public BasicOrderService() {
    }

    public void addProductInBucket(Product product) {
        bucket.add(product);
    }

    public void placeOrder() {
        System.out.println("주문이 완료되었습니다.");
    }


}
