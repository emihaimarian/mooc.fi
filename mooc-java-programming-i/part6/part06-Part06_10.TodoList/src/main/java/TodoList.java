import java.util.ArrayList;

public class TodoList {
 
    private ArrayList<String> todoList;
    
    public TodoList(){
        todoList = new ArrayList<>();
    }            
    
    public void add(String task){
        this.todoList.add(task);
    }
    
    public void print(){
        
        int counter = 0;
        int positionInList = 1;
        
        while (counter < todoList.size()){
            System.out.println(positionInList + ": " + todoList.get(counter));
            counter++;
            positionInList++;
        }
    }
    
    public void remove(int number){
        this.todoList.remove(number - 1);
    }
}