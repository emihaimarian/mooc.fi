
import java.util.Scanner;

public class UserInterface {

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }

    public void start() {

        while (true) {

            System.out.println("Command:");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.contains("add")) {
                
                System.out.println("Task:");
                String task = scanner.nextLine();
                
                todoList.add(task);
            } else if (command.contains("list")) {
                todoList.print();
            } else if (command.contains("remove")) {
                System.out.println("Which one is removed?");
                int indexToRemove = scanner.nextInt();
                todoList.remove(indexToRemove);
            }
        }
    }
}
