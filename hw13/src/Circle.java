import java.util.Objects;

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void erase() {
        System.out.println("Circle erased");
    }

    @Override
    void draw() {
        System.out.println("Circle drawn");
    }

    @Override
    double calculateArea() {
        super.area = Math.PI * radius * radius;
        return super.area;
    }

    @Override
    double calculateCircumference() {
        super.circumference = 2 * Math.PI * radius;
        return circumference;
    }

    @Override
    public String toString() {
        String s = "Bu " + radius + " birim yarıçapa sahip bir çemberdir.";
        return s;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Circle)) {
            return false;
        }
        Circle otherCircle = (Circle) obj;
        if(this.radius == otherCircle.radius){
            return  true;
        }else {
            return  false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}