public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
// public double calculateTax() {
  //      return price * taxRate

/*  public double calculateTax() {
        return price * taxRate;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    
     public Product(String name, double price, double taxRate) {
        this.name = name;
        this.price = price;
        this.taxRate = taxRate;
    }
    */
