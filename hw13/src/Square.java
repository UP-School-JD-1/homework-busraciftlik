class Square extends Shape{
    double edge;

    Square(int edge){

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
        super.area = edge*edge;
        return area;
    }

    @Override
    double calculateCircumference() {
        super.circumference = 4*edge;
        return super.circumference;
    }
}
