public class User {
    private String name;
    private TaskList taskList;

    public User(String name) {
        this.name = name;
        this.taskList = new TaskList(); // Initialize an empty task list
    }

    public String getName() {
        return name;
    }

    public void addTask(String description) {
        System.out.print("Adding task for " + name + ": ");
        taskList.addTask(new Task(description));
    }

    public void markTaskAsCompleted(String description) {
        System.out.print("Marking task as completed for " + name + ": ");
        taskList.markTaskAsCompleted(description);
    }

    public void printTasks() {
        System.out.println("\n--- " + name + "'s Task List ---");
        taskList.printTasks();
        System.out.println("----------------------------");
    }



}
