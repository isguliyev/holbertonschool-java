import java.util.ArrayList;

public class TodoList {
    private ArrayList<Task> tasks;

    public TodoList() {
        setTasks(new ArrayList<Task>());
    }

    public void listTasks() {
        for (Task task : getTasks()) {
            System.out.printf("[%s]  Id: %d - Description: %s\n",
                task.isDone ? "X" : " ",
                task.getIdentifier(),
                task.getDescription());
        }
    }

    public void undoAll() {
        for (Task task : getTasks()) {
            task.isDone = false;
        }
    }

    public void completeAll() {
        for (Task task : getTasks()) {
            task.isDone = true;
        }
    }

    public boolean markTaskDone(int identifier) {
        for (Task task : getTasks()) {
            if (task.getIdentifier() == identifier) {
                task.isDone = true;
                return true;
            }
        }

        return false;
    }

    public boolean undoTask(int identifier) {
        for (Task task : getTasks()) {
            if (task.getIdentifier() == identifier) {
                task.isDone = false;
                return true;
            }
        }

        return false;
    }

    public void addTask(Task taskToAdd) throws Exception {
        for (Task task : getTasks()) {
            if (task.getIdentifier() == taskToAdd.getIdentifier()) {
                throw new Exception(
                    "Task with identifier "
                    + task.getIdentifier()
                    + " already exists in the list");
            }
        }

        getTasks().add(taskToAdd);
    }

    public ArrayList<Task> getTasks() {
        return this.tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }
}