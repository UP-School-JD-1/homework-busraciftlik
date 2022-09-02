public abstract class Product {
    String sku;
    String description;


    Product(String sku, String description) {
        this.sku = sku;
        this.description = description;
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

    }

