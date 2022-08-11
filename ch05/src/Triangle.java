public class Triangle {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {


        }


    }

    public void drawTriangle(int height) {
        for (int i = 1; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


