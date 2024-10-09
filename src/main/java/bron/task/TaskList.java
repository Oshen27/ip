package bron.task;

import java.util.ArrayList;

public class TaskList {
    private final ArrayList<Task> tasks;

    public TaskList(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public Task getTask(int index) throws IndexOutOfBoundsException {
        return tasks.get(index);
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void deleteTask(int index) throws IndexOutOfBoundsException {
        Task removedTask = tasks.remove(index);
        System.out.println("Deleted task: " + removedTask);
    }

    public int size() {
        return tasks.size();
    }

    public void printTasks() {
        System.out.printf("You have %d tasks in your list.%n", tasks.size());
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
}