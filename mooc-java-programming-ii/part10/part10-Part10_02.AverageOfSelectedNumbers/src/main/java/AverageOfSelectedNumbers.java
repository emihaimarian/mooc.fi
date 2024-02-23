
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputs = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {

            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            inputs.add(input);
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String answer = scanner.nextLine();

        if (answer.equals("p")) {

            double positiveNumbersAverage = inputs.stream()
                    .mapToInt(string -> Integer.valueOf(string))
                    .filter(value -> value > 0)
                    .average()
                    .getAsDouble();

            System.out.println("Average of the positive numbers: " + positiveNumbersAverage);

        } else if (answer.equals("n")) {
            double negativeNumbersAverage = inputs.stream()
                    .mapToInt(string -> Integer.valueOf(string))
                    .filter(value -> value < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + negativeNumbersAverage);
        }

    }
}
