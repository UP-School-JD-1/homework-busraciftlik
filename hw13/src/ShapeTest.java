public class ShapeTest {
    public static void main(String[] args) {

        /*Shape shape = new Shape(); It doesnt make sense because shape is an abstract entity
        System.out.println(shape.calculateArea());
        shape.draw();*/


        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(5,8);

        circle.draw();
        rectangle.draw();
	
    }
}
