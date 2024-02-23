
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise

        int howManyTimesToPrint = 0;

        while (howManyTimesToPrint < number) {

            System.out.print("*");
            howManyTimesToPrint++;
        }

        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise

        int howManyTimesToPrint = 0;

        while (howManyTimesToPrint < number) {

            System.out.print(" ");
            howManyTimesToPrint++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise

        int lineToStartToPrint = 1;

        while (lineToStartToPrint <= size) {

            printSpaces(size - lineToStartToPrint);
            printStars(lineToStartToPrint);

            lineToStartToPrint++;
        }

    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        
        int spaces = height - 1;
        for (int i = 1; i <= height; i++) {
            printSpaces(spaces);
            printStars(i * 2 - 1);
            spaces--;
        }
        
        for (int j = 2; j > 0; j--) {
            printSpaces(height - 2);
            printStars(3);
        }


    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
