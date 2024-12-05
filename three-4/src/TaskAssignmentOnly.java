public class TaskAssignmentOnly implements TaskAssignment {

    @Override
    public void assignTask(int taskId, String assignee) {
        // Logic for assigning task
        System.out.println("Task " + taskId + " assigned to " + assignee);
    }
}
