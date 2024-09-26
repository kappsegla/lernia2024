package se.lernia.java.discount;

public abstract class BaseDiscount implements Discount {

    protected final Discount nextDiscount;

    protected BaseDiscount(Discount nextDiscount) {
        this.nextDiscount = nextDiscount;
    }

    @Override
    public final double apply(Product product) {
        double discount = 0.0;
        if( isApplicable(product) ) {
            discount = calculateDiscount(product);
        }
        return discount + nextDiscount.apply(product);
    }

    @Override
    public String getDescription(Product product) {
        String description = "";
        if( isApplicable(product) ) {
            description = description(product);
        }
        return description + nextDiscount.getDescription(product);
    }

    protected abstract boolean isApplicable(Product product);

    protected abstract double calculateDiscount(Product product);

    protected abstract String description(Product product);

}
