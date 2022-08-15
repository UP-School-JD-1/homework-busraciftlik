import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println("Enter the number Please!");
        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < 11; i++) {
           int n = scanner.nextInt();
//            printWhetherIsNumberPrime(n);
//        }
        int count = countPrimeNumbersUpToGivenNumber(n);
        System.out.println(count);

    }

    public static void printWhetherIsNumberPrime(int n){
        boolean isPrime = isPrime(n);
        if (isPrime) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
    }
    public static boolean isPrime(int number) {
        //boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrimeNumbersUpToGivenNumber(int number){
        int count = 0;
        for (int i = 2; i <number ; i++) {
            boolean prime = isPrime(i);
            if(prime){
                count++;
            }
        }
        return count;
    }
}
