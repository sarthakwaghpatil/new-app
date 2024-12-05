class Cheese extends ToppingDecorator {
    public Cheese(Pizza tempPizza) {
        super(tempPizza);
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 1.50; // Cost of cheese topping
    }
}

class Olives extends ToppingDecorator {
    public Olives(Pizza tempPizza) {
        super(tempPizza);
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Olives";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 1.00; // Cost of olives topping
    }
}

class Mushrooms extends ToppingDecorator {
    public Mushrooms(Pizza tempPizza) {
        super(tempPizza);
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Mushrooms";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 1.25; // Cost of mushrooms topping
    }
}