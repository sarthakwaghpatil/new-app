public class main {
    public static void main(String[] args) {
        // Creating Employees
        Employee emp1 = new Employee("Alice");
        Employee emp2 = new Employee("Bob");
        Employee emp3 = new Employee("Charlie");
        
        // Creating Managers
        Manager manager1 = new Manager("David");
        Manager manager2 = new Manager("Eve");

        // Assigning Employees to Managers
        manager1.addSubordinate(emp1);
        manager1.addSubordinate(emp2);
        
        manager2.addSubordinate(emp3);
        manager2.addSubordinate(manager1); // Manager2 manages Manager1

        // Showing Organizational Structure
        manager2.showDetails(); // This will display the manager and all subordinates, including nested managers
        
        // Assigning task through a manager
        manager2.assignTask("Complete project report"); // Manager2 delegates task to its subordinates
    }
}
