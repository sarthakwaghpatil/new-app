public class CompositePatternDemo {
    public static void main(String[] args) {
        // Individual employees
        Employee dev1 = new IndividualEmployee("Alice", "Developer");
        Employee dev2 = new IndividualEmployee("Bob", "Developer");
        Employee tester = new IndividualEmployee("Charlie", "Tester");

        // Manager with a team of developers
        Manager devManager = new Manager("David", "Development Manager");
        devManager.addEmployee(dev1);
        devManager.addEmployee(dev2);

        // General Manager supervising both a manager and an individual employee
        Manager generalManager = new Manager("Eve", "General Manager");
        generalManager.addEmployee(devManager);
        generalManager.addEmployee(tester);

        // Display the full reporting structure
        System.out.println("Company Hierarchy:");
        generalManager.showDetails();
    }
}