public class Employee implements EmployeeComponent {
    private String name;
    
    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void assignTask(String task) {
        System.out.println(name + " has been assigned task: " + task);
    }

    @Override
    public void showDetails() {
        System.out.println("Employee: " + name);
    }
}
