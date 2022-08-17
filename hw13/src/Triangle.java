import java.util.Objects;

class Triangle extends Shape {
    int height;
    int edge;
    int edge1;


    Triangle(int height, int edge, int edge1) {

    }

    @Override
    void draw() {
        System.out.println("Triangle drawn");
    }

    @Override
    void erase() {
        System.out.println("Triangle erased");
    }

    @Override
    double calculateArea() {
        super.area = height*edge/2;
        return super.area;
    }

    @Override
    double calculateCircumference() {
        super.circumference = edge+edge1+height;
        return super.circumference;
    }

    @Override
    public String toString() {
        String s = "Bu bir üçgendir.";
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Triangle otherTriangle = (Triangle) obj;
        return this.edge == otherTriangle.edge & this.edge1 == otherTriangle.edge1 & this.height == otherTriangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, edge, edge1);
    }
}
