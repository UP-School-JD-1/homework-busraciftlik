import java.util.Arrays;
import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int[] array = initializeArray(8);
        System.out.println(Arrays.toString(array));


        int[] distinctArray = new int[8];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isExists = isGivenNumberExistsInGivenArray(array[i],distinctArray);
            if (!isExists) {
                distinctArray[index] = array[i];
                index++;
            }
        }

        int[] withoutZero = Arrays.copyOfRange(distinctArray,0 , index);
        System.out.println(Arrays.toString(distinctArray));
        System.out.println(Arrays.toString(withoutZero));
    }

    static int[] initializeArray(int length) {

        int[] array = new int[length];
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = r.nextInt(10);
        }
        return array;
    }

    static boolean isGivenNumberExistsInGivenArray(int number, int[] array) {
        boolean isExists = false;
        for (int j = 0; j <array.length; j++) {
            if (number == array[j]) {
                isExists = true;
            }
        }
        return isExists;
    }

}

