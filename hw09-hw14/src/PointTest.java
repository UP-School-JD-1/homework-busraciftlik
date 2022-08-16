public class PointTest {
    public static void main(String[] args) {

        Point point = new Point();
        Point point1 = new Point();
        System.out.println(point.getX()+","+ point.getY());
        point.setX(3);
        point.setY(4);
        System.out.println(point.getX()+","+ point.getY());
        System.out.println(point1.getX()+","+ point1.getY());


        System.out.println( point.distanceFromOrigin());

        System.out.println(point.distanceBetweenPoints(point1));

        point1.moveX(5);
        point1.moveY(6);
        System.out.println(point1.getX()+","+ point1.getY());
    }
}
