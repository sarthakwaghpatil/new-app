// VehicleFactory class (Creator)
public class VehicleFactory {
    
    // Factory method to create a Vehicle based on input
    public Vehicle getVehicle(String vehicleType) {
        if(vehicleType == null) {
            return null;
        }
        if(vehicleType.equalsIgnoreCase("Car")) {
            return new Car();
        } else if(vehicleType.equalsIgnoreCase("Bike")) {
            return new Bike();
        }
        return null;
    }
}
