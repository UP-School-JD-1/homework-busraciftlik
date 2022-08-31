public abstract class Product {
    String sku;
    String description;
    double price;
    double tax;

    Product(String sku, String description, double price, double tax) {
        this.sku = sku;
        this.description = description;
        this.price = price;
        this.tax = tax;
    }

    String getSku() {
        return sku;
    }

    void setSku(String sku) {
        this.sku = sku;
    }

    String getDescription() {
        return description;
    }

    void setDescription(String description) {
        this.description = description;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    double getTax() {
        return tax;
    }

    void setTax(double tax) {
        this.tax = tax;
    }

}
