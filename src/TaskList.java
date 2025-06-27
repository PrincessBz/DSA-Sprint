public class TaskList {
    private class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head;

    public TaskList() {
        this.head = null;
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Task '" + task.getDescription() + "' added to the list.");
    }

    public boolean markTaskAsCompleted(String description) {
        Node current = head;
        while (current != null) {
            if (current.task.getDescription().equalsIgnoreCase(description)) {
                current.task.markCompleted();
                System.out.println("Task '" + description + "' marked as completed.");
                return true;
            }
            current = current.next;
        }
        System.out.println("Task '" + description + "' not found in the list.");
        return false;

    }

    public void printTasks() {
        if (head == null) {
            System.out.println("No tasks in the list.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }



}
