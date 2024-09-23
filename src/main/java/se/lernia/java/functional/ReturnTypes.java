package se.lernia.java.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReturnTypes {
    private int productCount = 0;
    List<Product> products = new ArrayList<>();
    Product product = null;

    public ReturnTypes(Product product) {
        this.product = product;
    }

    List<Product> getAllProducts() {
        return List.of();
    }

    Optional<Product> getProductById(int productId) {
        return products.stream()
                .filter(p->p.id() == productId)
                .findFirst();

//        if (productCount == 0) {
//            //return null;
//            //throw new IllegalStateException();
//            return Optional.empty();
//        }
//        return Optional.of(new Product());
    }

    public static void main(String[] args) {
        ReturnTypes rt = new ReturnTypes(null);
        Optional<Product> p = rt.getProductById(1);

        p.ifPresentOrElse(System.out::println,
                ()-> System.out.println("No product found"));

    }


}

record Product(int id) {
}
