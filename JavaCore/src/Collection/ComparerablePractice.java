package Collection;

import util.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparerablePractice {

    public static void main(String[] args) {


        List<Product> products = new ArrayList<>();

        products.add(new Product(13));
        products.add(new Product(99));
        products.add(new Product(4534));
        products.add(new Product(1));

        Collections.sort(products);
        System.err.println(products);


    }
}
