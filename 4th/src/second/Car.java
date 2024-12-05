package second;

public class Car implements Vehicle {
    private Engine engine; // A vehicle has an engine, and it can be either petrol or electric

    public Car(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        System.out.print("Car: ");
        engine.startEngine(); // Delegates to engine's startEngine method
    }

    @Override
    public void stopEngine() {
        System.out.print("Car: ");
        engine.stopEngine(); // Delegates to engine's stopEngine method
    }
}
