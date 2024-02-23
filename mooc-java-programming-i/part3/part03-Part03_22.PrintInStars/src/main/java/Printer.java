
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        
        for (int stars : array) {
            printStars(stars);
            System.out.println("");
        }
        
    }
    
    public static void printStars(int numberToPrint){
        
        while (numberToPrint > 0){
            System.out.print("*");
            numberToPrint--;
        }
    }

}
