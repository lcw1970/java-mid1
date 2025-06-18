package pay;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    List<Product> products = new ArrayList<>();

    public ProductManager() {
        products.add(new Product("노트북",10000));
        products.add(new Product("마우스",20000));
    }

    public void showProduct() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void buyProduct(String name,Payment payMenu){
        for (Product product : products) {
            if(product.getName().equals(name)){
                payMenu.pay(product.getPrice());
                return;
            }
        }
        System.out.println("그러한 제품은 존재하지않습니다.");

    }
}
