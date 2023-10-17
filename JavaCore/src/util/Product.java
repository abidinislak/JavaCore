package util;

public class Product implements Comparable<Product> {

    private final Integer id;

    public Product(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;

        return id.equals(product.id);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + id;
        return hash;
    }

    @Override
    public String toString() {
        return "Product{ " + "id=" + id + "}";
    }

    @Override
    public int compareTo(Product o) {
        return id.compareTo(o.id);
    }
}
