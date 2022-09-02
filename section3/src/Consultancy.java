public class Consultancy extends Product implements Priceable{
    Consultancy(String sku, String description) {
        super(sku, description);
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
    public void purchase() {

    }

    @Override
    public void pay() {

    }
}
