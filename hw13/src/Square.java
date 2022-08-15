class Square extends Shape{
    double edge;
    @Override
    void draw() {
        super.draw();
    }

    @Override
    void erase() {
        super.erase();
    }

    @Override
    double calculateArea() {
        area = edge*edge;
        return super.calculateArea();
    }

    @Override
    double calculateCircumference() {
        return super.calculateCircumference();
    }
}
