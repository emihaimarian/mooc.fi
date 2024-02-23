
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();

        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());

        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        List<Integer> list = new ArrayList<>();
        
        try (Scanner readFile = new Scanner(Paths.get(file));) {

            while (readFile.hasNext()) {
                list.add(readFile.nextInt());
            }
            
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
        int counter = 0;
        
        for (Integer integer : list) {
            
            if (integer >= lowerBound && integer <= upperBound){
                counter++;
            }
        }
        
        System.out.println("Numbers: " + counter);
    }

}
