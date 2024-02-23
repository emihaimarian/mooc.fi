
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        List<Integer> numbers = new ArrayList<>();
        
        while(true){
        
            int integer = scanner.nextInt();
            
            if(integer < 0){
                break;
            }
            
            numbers.add(integer);
        }
        
        numbers.stream().filter(integer -> integer <= 5).forEach(integer -> System.out.println(integer));
    }
}
