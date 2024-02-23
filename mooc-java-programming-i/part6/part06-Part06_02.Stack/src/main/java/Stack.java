import java.util.ArrayList;
import java.util.List;

public class Stack {

    private ArrayList<String> stack;
    
    public Stack(){
        this.stack = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        
        if(!this.stack.isEmpty()){
            return false;
        }
        
        return true;
    }
    
    public void add(String value){
        this.stack.add(value);
    }
    
    public ArrayList<String> values(){
        return this.stack;
    }
    
    public String take(){
        
        String lastValue = this.stack.get(this.stack.size() - 1);
        this.stack.remove(lastValue);
        
        return lastValue;
    }

    public ArrayList<String> getStack() {
        return stack;
    }
}
