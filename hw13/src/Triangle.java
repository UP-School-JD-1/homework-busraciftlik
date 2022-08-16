class Triangle extends Shape {
    int height;
    int edge;
    int edge1;
    int edge2;

    Triangle(int height, int edge, int edge1 , int edge2) {

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
        super.circumference = edge+edge1+edge2 ;
        return super.circumference;
    }
}
