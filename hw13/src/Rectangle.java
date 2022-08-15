class Rectangle extends Shape {
    int height;
    int weight;

    @Override
    void draw() {
        super.draw();
    }

    @Override
    void erase() {
        super.erase();
    }

    @Override
    double calculateCircumference() {
        area = height*weight;
        return super.calculateCircumference();
    }

    @Override
    double calculateArea() {
        return super.calculateArea();
    }
}
