
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        List<String> inputs = new ArrayList<>();
        
        while(true){
        
            String input = scanner.nextLine();
            
            if (input.equals("end")){
                break;
            }
            inputs.add(input);
        }
        
        Double average = inputs
                .stream()
                .mapToInt(string -> Integer.valueOf(string))
                .average()
                .getAsDouble();
        
        System.out.println("Average of the numbers: " + average);
    }
}
