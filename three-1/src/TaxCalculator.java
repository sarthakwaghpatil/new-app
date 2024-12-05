public class TaxCalculator {
    private double taxRate;

    public TaxCalculator(double taxRate) {
        this.taxRate = taxRate;
    }

    public double calculateTax(Product product) {
        return product.getPrice() * taxRate;
    }
}
