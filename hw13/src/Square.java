import java.util.Objects;

class Square extends Shape {
    int edge;

    Square(int edge) {
        this.edge = edge;
    }

    public  void setEdge(int edge){
        this.edge = edge;
    }

    @Override
    void draw() {
        System.out.println("Square drawn");
    }

    @Override
    void erase() {
        System.out.println("Square erased");
    }

    @Override
    double calculateArea() {
        super.area = edge * edge;
        return area;
    }

    @Override
    double calculateCircumference() {
        super.circumference = 4 * edge;
        return super.circumference;
    }

    @Override
    public String toString() {
        String s = "Bu " + edge + " birim kenar uzunluğuna sahip bir karedir.";
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Square)) {
            return false;
        }
        Square otherSquare = (Square) obj;
        if (this.edge == otherSquare.edge) {
            return true;
        }else {
            return  false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(edge);
    }
}
