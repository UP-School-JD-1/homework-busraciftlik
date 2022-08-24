public class Arrays {
    public static void main(String[] args) {
        int[] array = new int[10];
        /*System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);*/
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i] + ", ");
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = i*3;
            System.out.println("Eleman no: " + i + " = " +array[i]);
        }
    }
}
