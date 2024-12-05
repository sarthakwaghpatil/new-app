package second;

public class Motorbike implements Vehicle {
    private Engine engine; // A vehicle has an engine, and it can be either petrol or electric

    public Motorbike(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        System.out.print("Motorbike: ");
        engine.startEngine(); // Delegates to engine's startEngine method
    }

    @Override
    public void stopEngine() {
        System.out.print("Motorbike: ");
        engine.stopEngine(); // Delegates to engine's stopEngine method
    }
}