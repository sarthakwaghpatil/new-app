public class main {
    public static void main(String[] args) {
        // Using TaskManagerImpl (which implements all interfaces)
        TaskManagerImpl taskManager = new TaskManagerImpl();
        taskManager.createTask("Develop feature");
        taskManager.assignTask(1, "Alice");
        taskManager.markTaskAsComplete(1);

        // Using TaskCreationOnly (for creating tasks only)
        TaskCreationOnly taskCreationOnly = new TaskCreationOnly();
        taskCreationOnly.createTask("Design UI");

        // Using TaskAssignmentOnly (for assigning tasks only)
        TaskAssignmentOnly taskAssignmentOnly = new TaskAssignmentOnly();
        taskAssignmentOnly.assignTask(2, "Bob");

        // Using TaskCompletionOnly (for marking tasks complete only)
        TaskCompletionOnly taskCompletionOnly = new TaskCompletionOnly();
        taskCompletionOnly.markTaskAsComplete(2);
    }
}
