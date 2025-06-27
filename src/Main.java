public class Main {
    public static void main(String[] args) {
        System.out.println("--- Welcome to the Task Manager ---\n");

        User[] users = new User[3];
        users[0] = new User("Alice");
        users[1] = new User("Bob");
        users[2] = new User("Charlie");

        System.out.println("Users created: ");
        for (User user : users) {
            System.out.println("- " + user.getName());
        }

        // Adding tasks for each user
        users[0].addTask("Buy groceries");
        users[0].addTask("Complete homework");
        users[1].addTask("Prepare presentation");

        users[1].addTask("Attend meeting");
        users[2].addTask("Read a book");
        users[2].addTask("Go for a run");

        System.out.println("\n--- Task Lists ---");
        for (User user : users) {
            user.printTasks();
        }

        // Marking tasks as completed
        users[0].markTaskAsCompleted("Buy groceries");
        users[1].markTaskAsCompleted("Attend meeting");
        users[2].markTaskAsCompleted("Read a book");

        System.out.println("\n--- Updated Task Lists ---");
        for (User user : users) {
            user.printTasks();
        }
        System.out.println("\n--- Task Manager Operations Completed ---");


    }
}
