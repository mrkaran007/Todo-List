import java.util.ArrayList;
import java.util.Scanner;

class Task {
    private String description;
    private boolean isCompleted;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}

public class TodoList {
    private ArrayList<Task> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        Task task = new Task(description);
        tasks.add(task);
    }

    public void deleteTask(int taskNumber) {
        try {
            tasks.remove(taskNumber - 1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid task number.");
        }
    }

    public void displayTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            System.out.println((i + 1) + ". " + task.getDescription() + " - " + (task.isCompleted()? "Completed" : "Not Completed"));
        }
    }

    public void markTaskAsCompleted(int taskNumber) {
        try {
            Task task = tasks.get(taskNumber - 1);
            task.setCompleted(true);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid task number.");
        }
    }

    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        while (true) {
        System.out.println();
            System.out.println("1. Add task");
            System.out.println("2. Delete task");
            System.out.println("3. Display tasks");
            System.out.println("4. Mark task as completed");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter task description: ");
                    scanner.nextLine();
                    String description = scanner.nextLine();
                    todoList.addTask(description);
                    break;
                case 2:
                    System.out.print("Enter task number to delete: ");
                    int taskNumberToDelete = scanner.nextInt();
                    todoList.deleteTask(taskNumberToDelete);
                    break;
                case 3:
                    todoList.displayTasks();
                    break;
                case 4:
                    System.out.print("Enter task number to mark as completed: ");
                    int taskNumberToMark = scanner.nextInt();
                    todoList.markTaskAsCompleted(taskNumberToMark);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}