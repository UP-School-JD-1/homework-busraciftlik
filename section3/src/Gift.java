public class Gift extends Product implements Locatable {
    Gift(String sku, String description) {
        super(sku, description);
    }

    @Override
    public String getPlace() {
        return null;
    }
    @Override
    public String getDepot() {
        return null;
    }
}
