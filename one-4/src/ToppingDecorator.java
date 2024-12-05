abstract class ToppingDecorator implements Pizza {
    protected Pizza tempPizza; // Reference to the wrapped Pizza object

    public ToppingDecorator(Pizza tempPizza) {
        this.tempPizza = tempPizza;
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }

    @Override
    public double getCost() {
        return tempPizza.getCost();
    }
}