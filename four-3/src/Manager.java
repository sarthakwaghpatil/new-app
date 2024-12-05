import java.util.ArrayList;
import java.util.List;

public class Manager implements EmployeeComponent {
    private String name;
    private List<EmployeeComponent> subordinates = new ArrayList<>();

    public Manager(String name) {
        this.name = name;
    }

    // Add an Employee or Manager as a subordinate
    public void addSubordinate(EmployeeComponent subordinate) {
        subordinates.add(subordinate);
    }

    @Override
    public void assignTask(String task) {
        System.out.println(name + " is delegating task: " + task);
        for (EmployeeComponent subordinate : subordinates) {
            subordinate.assignTask(task); // Delegates the task to subordinates
        }
    }

    @Override
    public void showDetails() {
        System.out.println("Manager: " + name);
        for (EmployeeComponent subordinate : subordinates) {
            subordinate.showDetails(); // Shows details of all subordinates
        }
    }
}
