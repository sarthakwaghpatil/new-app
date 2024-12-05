public class TaskCreationOnly implements TaskCreation {

    @Override
    public void createTask(String taskName) {
        // Logic for creating task
        System.out.println("Task Created: " + taskName);
    }
}
