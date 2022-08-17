import java.util.Objects;

class Rectangle extends Shape {
    int height;
    int weight;

    Rectangle(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public void setWeightAndHeight(int height , int weight){
        this.weight= weight;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Rectangle drawn");
    }

    @Override
    void erase() {
        System.out.println("Rectangle erased");
    }

    @Override
    double calculateCircumference() {
        super.circumference = 2 * (height + weight);
        return super.circumference;
    }

    @Override
    double calculateArea() {
        super.area = height * weight;
        return super.area;

    }

    @Override
    public String toString() {
        String s = "Bu " + height + " birim yükseklik ve " + weight + " birim genişliğe sahip bir dikdörtgendir.";
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Rectangle)) {
            return false;
        }
        Rectangle otherRectange = (Rectangle) obj;
        if (this.weight == otherRectange.weight & this.height == otherRectange.height) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, weight);
    }
}
