public class Rectangle {
    public static void main(String[] args) {

       /* for (int i = 0; i < 4; i++) {
            System.out.print("*");
            for (int j = 0; j < 4; j++) {
                if(i== 0 | i==3) {
                    System.out.print("*");
                }else if (j==3){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }*/
        Rectangle rectangle = new Rectangle();
        rectangle.drawFilledRectangle(4, 5);
        rectangle.drawRectangle(5, 3);
    }

    void drawFilledRectangle(int row, int column) {
        for (int i = 0; i < row; i++) {
            System.out.print("*");
            for (int j = 1; j < column; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    void drawRectangle(int row, int column) {
        for (int i = 0; i < row; i++) {
            System.out.print("*");
            for (int j = 0; j < column; j++) {
                if (i == 0 | i == row - 1) {
                    System.out.print("*");
                } else if (j == column - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}

