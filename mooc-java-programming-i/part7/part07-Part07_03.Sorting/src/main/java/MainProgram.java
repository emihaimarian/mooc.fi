
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {6, 5, 8, 7, 11};

        System.out.println("Smallest: " + MainProgram.smallest(numbers));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));

        int[] numberss = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(numberss, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numberss, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numberss, 2));
        
        MainProgram.sort(numberss);
        
    }

    public static int smallest(int[] array) {

        int smallest = array[0];

        for (int counter = 0; counter < array.length; counter++) {

            if (smallest > array[counter]) {
                smallest = array[counter];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {

        int indexOfTheSmallest = 0;
        int smallest = array[0];

        for (int counter = 0; counter < array.length; counter++) {
            if (array[counter] < smallest) {
                smallest = array[counter];
                indexOfTheSmallest = counter;
            }
        }

        return indexOfTheSmallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {

        int index = startIndex;
        int smallest = table[index];

        for (int counter = startIndex; counter < table.length; counter++) {

            if (table[counter] < smallest) {
                smallest = table[counter];
                index = counter;
            }
        }

        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {

        int index = 0;
        
        System.out.println(Arrays.toString(array));
        
        while (index < array.length){
        
            swap(array, index, indexOfSmallestFrom(array, index));
            System.out.println(Arrays.toString(array));
            index++;
        }
    }
}
