
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int giftValue = Integer.valueOf(scan.nextLine());

        if (giftValue < 5000) {
            System.out.println("No tax");
        } else if (giftValue >= 5000 && giftValue < 25000) {
            System.out.println("Tax: " + taxFormula(5000, 100, 0.08, giftValue));
        } else if (giftValue >= 25000 && giftValue < 55000) {
            System.out.println("Tax: " + taxFormula(25000, 1700, 0.10, giftValue));
        } else if (giftValue >= 55000 && giftValue < 200000) {
            System.out.println("Tax: " + taxFormula(55000, 4700, 0.12, giftValue));
        } else if (giftValue >= 200000 && giftValue < 1000000) {
            System.out.println("Tax: " + taxFormula(200000, 22100, 0.15, giftValue));
        } else if (giftValue >= 1000000) {
            System.out.println("Tax: " + taxFormula(1000000, 142100, 0.17, giftValue));
        }
    }

    private static double taxFormula(int lowerLimitOfGiftValue, int taxAtTheLowerLimit, double taxRate, int giftValue) {
        return (taxAtTheLowerLimit + (giftValue - lowerLimitOfGiftValue) * taxRate);
    }
}
