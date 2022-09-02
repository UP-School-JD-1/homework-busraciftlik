public class ClothProduct extends Product implements Locatable, Priceable {
    String sex;
    String size;

    ClothProduct(String sku, String description, double price, double tax, String sex, String size) {
        super(sku, description);
        this.sex = sex;
        this.size = size;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public double getTax() {
        return 0;
    }

    @Override
    public String getDepot() {
        return null;
    }

    @Override
    public String getPlace() {
        return null;
    }

    @Override
    public void pay() {

    }

    @Override
    public void purchase() {

    }
}
