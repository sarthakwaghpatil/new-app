public class DecoratorPatternDemo {
    public static void main(String[] args) {
        // Start with a basic pizza
        Pizza myPizza = new BasicPizza();

        // Add cheese topping
        myPizza = new Cheese(myPizza);

        // Add olives topping
        myPizza = new Olives(myPizza);

        // Add mushrooms topping
        myPizza = new Mushrooms(myPizza);

        // Display the final description and cost
        System.out.println("Pizza Description: " + myPizza.getDescription());
        System.out.println("Total Cost: $" + myPizza.getCost());
    }
}