public class ShapeTest {
    public static void main(String[] args) {

        /*Shape shape = new Shape(); It doesnt make sense because shape is an abstract entity
        System.out.println(shape.calculateArea());
        shape.draw();*/


        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(5,8);
        Triangle triangle = new Triangle(5,4,3);
        Square square = new Square(5);
        Circle circle1 = new Circle(5);
        Rectangle rectangle1 = new Rectangle(5,8);
        Square square1 =  new Square(5);
        Triangle triangle1 = new Triangle(5,4,3);

        //circle.draw();
        //rectangle.draw();

        System.out.println(circle.toString());
        circle.setRadius(5);
        System.out.println(circle.toString());
        System.out.println(circle.equals(rectangle));
        System.out.println(circle.equals(circle1));
        System.out.println(circle.hashCode());
        System.out.println(rectangle.toString());
        System.out.println(triangle.toString());
        System.out.println(square.toString());
        System.out.println(rectangle.equals(rectangle1));
        System.out.println(square.equals(square1));
        System.out.println(triangle.equals(triangle1));

    }
}
