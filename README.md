# Todo List - Java Application

This is a simple console-based **Todo List** application written in **Java**, where users can add, delete, and manage tasks. It provides basic functionality for creating tasks, marking them as completed, and displaying all tasks in an organized manner.

## Features:

- **Add Task**:
  - Users can add tasks to the list by entering a task description.

- **Delete Task**:
  - Users can delete tasks by specifying the task number.

- **Display Tasks**:
  - Displays all tasks with their status (Completed or Not Completed) in a numbered list format.

- **Mark Task as Completed**:
  - Users can mark tasks as completed by selecting the task number.

## Class Structure:

- **Task**: 
  - Represents a single task with attributes for the task description and its completion status.
  
- **TodoList**: 
  - Manages the collection of tasks, providing methods for adding, deleting, and displaying tasks, as well as marking tasks as completed.

## How It Works:

1. **Add a Task**: 
   - Users are prompted to input a task description, which is added to the list.
2. **Delete a Task**:
   - Users specify the task number they wish to delete from the list.
3. **Display Tasks**:
   - Lists all the tasks with their current completion status (either "Completed" or "Not Completed").
4. **Mark Task as Completed**:
   - Users can mark a task as completed by specifying its task number.

## Sample Execution:

```bash
1. Add task
2. Delete task
3. Display tasks
4. Mark task as completed
5. Exit
Choose an option: 1
Enter task description: Complete Java project

1. Add task
2. Delete task
3. Display tasks
4. Mark task as completed
5. Exit
Choose an option: 3
1. Complete Java project - Not Completed

1. Add task
2. Delete task
3. Display tasks
4. Mark task as completed
5. Exit
Choose an option: 4
Enter task number to mark as completed: 1
```

## Technologies Used:

- **Java**: Core programming language for logic implementation.
- **Scanner**: Used for taking user input via the console.

## Setup and Usage:

1. Clone the repository:
   ```bash
   git clone https://github.com/mrkaran007/todo-list-java.git
   ```
2. Compile and run the Java program:
   ```bash
   javac TodoList.java
   java TodoList
   ```

## Future Enhancements:

- **Edit Task**: Add functionality to edit an existing task's description.
- **Task Deadlines**: Allow users to add deadlines to tasks and get reminders.
- **Persistence**: Add functionality to store tasks locally using file handling or a database, ensuring tasks persist between sessions.

## License:

This project is licensed under the [MIT License](LICENSE).

---

Feel free to adjust this based on your specific needs!
