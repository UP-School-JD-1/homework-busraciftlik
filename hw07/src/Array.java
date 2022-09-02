import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[8];
        Random r = new Random();
        for (int i = 0; i < 8; i++) {
            array[i] = r.nextInt(10);
            System.out.println(array[i]);
            }
        }
    }

