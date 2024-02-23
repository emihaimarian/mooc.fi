
import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<String> todoList;

    public TodoList() {
        this.todoList = new ArrayList<>();
    }

    public void add(String task) {
        this.todoList.add(task);
    }

    public void remove(int number) {
        this.todoList.remove(number - 1);
    }

    public void print() {
        int counter = 0;
        int positionInList = 1;

        while (counter < this.todoList.size()) {
            System.out.println(positionInList + ": " + this.todoList.get(counter));
            counter++;
            positionInList++;
        }
    }

}
