To-Do List Manager
This project implements a simple command-line based To-Do List Manager in Java. It demonstrates the use of core data structures: arrays for managing multiple users, and single linked lists for managing tasks within each user's personal to-do list.

Project Description
The primary goal of this project is to provide a basic system where users can manage their tasks. Each user has their own distinct to-do list, which is dynamically maintained using a single linked list. The overall system supports multiple users, stored in a simple array.

Features
User Management:

. Ability to create multiple users.

. Users are stored and accessed from an array.

. Each user is uniquely identified by their name.

Task Management:

. Add new tasks to a specific user's to-do list.

. Each task includes a textual description and a completion status (pending/completed).

. Tasks are efficiently stored and managed within a single linked list for each user, allowing for dynamic additions and status updates.

Mark Tasks as Completed:

. Update the status of a task from "pending" to "completed" by specifying its description.

View Tasks:

. Display all tasks for a particular user, including their current completion status.

Project Structure
The project is organized into four main Java classes:

- Task.java:

. Represents a single to-do item.

. Contains description (String) and isCompleted (boolean) fields.

. Includes a method (markCompleted()) to change its status.

- TaskList.java:

. Implements the single linked list data structure.

. Manages a collection of Task objects for a single user.

. Contains an inner private Node class that links tasks together.

. Provides methods to addTask(), markTaskCompleted(), and printTasks().

- User.java:

. Represents a user of the To-Do List Manager.

. Contains the user's name (String) and an instance of TaskList (their personal to-do list).

. Delegates task-related operations (add, mark completed, print) to its TaskList object.

- Main.java:

.The entry point of the application.

.Demonstrates all functionalities:

. Creates an array of User objects.

. Adds various tasks to different users' lists.

. Marks certain tasks as completed.

.Prints the state of each user's to-do list before and after updates.

.This class is designed as a non-interactive demonstration script.

How to Compile and Run
To compile and run this project, follow these steps:

1. Save the files:
Save each of the provided Java code blocks into separate .java files with their respective class names (Task.java, TaskList.java, User.java, Main.java) in the same directory.

2. Open a Terminal/Command Prompt:
Navigate to the directory where you saved your Java files using your terminal or command prompt.

3. Compile the Java files:
Execute the Java compiler command. This will compile all the .java files into .class files.

javac Task.java TaskList.java User.java Main.java

Alternatively, to compile all Java files in the directory:

javac *.java

4. Run the Main class:
Once compiled successfully, run the Main class to execute the demonstration.

java Main

Expected Output
The program will output a series of messages to the console, showing:

. Users being created.

. Tasks being added to specific users.

. The initial state of each user's to-do list.

. Messages indicating tasks being marked as completed.

. The updated state of each user's to-do list after tasks have been completed.
