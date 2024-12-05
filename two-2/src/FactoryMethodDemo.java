// Main class to demonstrate the Factory Method
public class FactoryMethodDemo {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        
        // Create a Car
        Vehicle car = vehicleFactory.getVehicle("Car");
        car.create();
        
        // Create a Bike
        Vehicle bike = vehicleFactory.getVehicle("Bike");
        bike.create();
    }
}
