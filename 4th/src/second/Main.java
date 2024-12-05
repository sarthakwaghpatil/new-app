package second;

public class Main {
    public static void main(String[] args) {
        // Creating vehicles with different engine types
        Vehicle carWithPetrolEngine = new Car(new PetrolEngine());
        Vehicle motorbikeWithElectricEngine = new Motorbike(new ElectricEngine());
        
        // Start and stop engines for different vehicles and engines
        carWithPetrolEngine.startEngine(); // Car with petrol engine starts
        carWithPetrolEngine.stopEngine();  // Car with petrol engine stops
        
        motorbikeWithElectricEngine.startEngine(); // Motorbike with electric engine starts
        motorbikeWithElectricEngine.stopEngine();  // Motorbike with electric engine stops
    }
}


