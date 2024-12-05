// Step 3: Create the Composite Class (Manager)

import java.util.ArrayList;
import java.util.List;

class Manager implements Employee {
    private String name;
    private String position;
    private List<Employee> team;

    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
        this.team = new ArrayList<>();
    }

    // Add an employee to the manager's team
    public void addEmployee(Employee employee) {
        team.add(employee);
    }

    // Remove an employee from the manager's team
    public void removeEmployee(Employee employee) {
        team.remove(employee);
    }

    @Override
    public void showDetails() {
        System.out.println("Manager: " + name + ", Position: " + position);
        System.out.println("Team:");
        for (Employee employee : team) {
            employee.showDetails();
        }
    }
}