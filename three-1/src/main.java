public class main {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 1000);
        TaxCalculator taxCalculator = new TaxCalculator(0.1); // 10% tax

        double tax = taxCalculator.calculateTax(product);
        System.out.println("Tax for " + product.getName() + ": $" + tax);
    }
}
