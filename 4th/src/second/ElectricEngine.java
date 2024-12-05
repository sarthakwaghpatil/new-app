package second;

public class ElectricEngine implements Engine {
    @Override
    public void startEngine() {
        System.out.println("Electric engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Electric engine stopped");
    }
}

