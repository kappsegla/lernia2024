package se.lernia.java.discount;

public class TestDiscount extends BaseDiscount{
    protected TestDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    protected boolean isApplicable(Product product) {
        return product.name().equals("Test");
    }

    @Override
    protected double calculateDiscount(Product product) {
        return product.price() * 0.1;
    }

    @Override
    public String description(Product product) {
        return "Our description" + nextDiscount.getDescription(product);
    }
}
