import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> taskList;

    public TaskManager() {
        taskList = new ArrayList<>();
    }

    public void addTask(String topic, String contents, String priority, String deadline) {
        Task newTask = new Task(topic, contents, priority, deadline);
        taskList.add(newTask);
    }

    public void removeTask(String topicToRemove){
        for(Task task : taskList){
            if(task.getTopic().equals(topicToRemove)){
                taskList.remove(task);
                break;
            }
        }
    }
    public void editContents(String topicToEdit, String newContents) {
        for (Task task : taskList) {
            if (task.getTopic().equals(topicToEdit)) {
                // Znaleziono pasujący element, teraz zaktualizuj jego zawartość
                task.setContents(newContents);
                break; // Zakończ pętlę po znalezieniu odpowiedniego elementu
            }
        }
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void displayTasks() {
        for (Task task : taskList) {
            System.out.println(task);
        }
    }

}
