public class ClothProduct extends Product {
    String sex;
    String size;

    ClothProduct(String sku, String description, double price, double tax, Location location, String sex, String size) {
        super(sku, description, price, tax, location);
        this.sex = sex;
        this.size = size;
    }
}
