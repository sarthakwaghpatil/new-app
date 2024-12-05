public class TaskManagerImpl implements TaskCreation, TaskAssignment, TaskCompletion {

    @Override
    public void createTask(String taskName) {
        // Logic for creating task
        System.out.println("Task Created: " + taskName);
    }

    @Override
    public void assignTask(int taskId, String assignee) {
        // Logic for assigning task
        System.out.println("Task " + taskId + " assigned to " + assignee);
    }

    @Override
    public void markTaskAsComplete(int taskId) {
        // Logic for marking task as complete
        System.out.println("Task " + taskId + " marked as complete.");
    }
}
