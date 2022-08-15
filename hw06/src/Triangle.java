public class Triangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.drawEquilateralTriangle(6);
    }


    public void drawTriangle(int height) {
        for (int i = 1; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void drawEquilateralTriangle(int height) {
        for (int row = 0; row < height; row++) {
            for (int j = 0; j < height-row; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*row+1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < height-row; j++) {
                System.out.print(" ");

            }
            System.out.println();
        }
    }
}








