
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.print("To add: ");
                String newTask = this.scanner.nextLine();
                todoList.add(newTask);
            } else if (command.equals("list")) {
                this.todoList.print();
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed?");
                int indexToRemove = Integer.valueOf(this.scanner.nextLine());
                this.todoList.remove(indexToRemove);
            }
        }
    }
}
