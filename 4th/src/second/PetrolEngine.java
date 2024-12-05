package second;

public class PetrolEngine implements Engine {
    @Override
    public void startEngine() {
        System.out.println("Petrol engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Petrol engine stopped");
    }
}


