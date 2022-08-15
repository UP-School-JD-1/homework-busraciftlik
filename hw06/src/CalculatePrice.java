import java.util.Scanner;

public class CalculatePrice {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        CalculatePrice calculatePrice = new CalculatePrice();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        calculatePrice.printCalculatedPrice(n);

    }

    double calculatePrice(int numberOfCopy) {
        double price = 0;
        int numberOfCopy25 = numberOfCopy / 25;
        price += numberOfCopy25 * 100;
        numberOfCopy = numberOfCopy - numberOfCopy25 * 25;
        int numberOfCopy12 = numberOfCopy / 12;
        price += numberOfCopy12 * 50;
        numberOfCopy = numberOfCopy - numberOfCopy12 * 12;
        int numberOf1 = numberOfCopy;
        price += numberOfCopy * 5;

        return (price/100);
    }

    void printCalculatedPrice (int numberOfCopy) {
       double calculatePrice =  calculatePrice(numberOfCopy);
        System.out.println("Price:" +calculatePrice(numberOfCopy)+ " Tl.");
    }
}
