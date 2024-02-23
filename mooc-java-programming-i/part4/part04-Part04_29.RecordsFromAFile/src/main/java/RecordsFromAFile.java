
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner readFile = new Scanner(Paths.get(file));) {

            while (readFile.hasNext()) {
                
                String [] stringArray = readFile.nextLine().split(",");
                
                String name = stringArray[0];
                int age = Integer.valueOf(stringArray[1]);
                
                String formattedYears = "years";
                
                if (age == 1){
                    formattedYears = "year";
                }
                
                System.out.println(name + ", age: " + age + " " + formattedYears);
            }

        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
