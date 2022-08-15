class Circle extends Shape {
    int diameter;

    @Override
    void erase() {
        super.erase();
    }

    @Override
    void draw() {
        super.draw();
    }

    @Override
    double calculateArea() {
        area = 2*diameter*Math.PI;
        return super.calculateArea();
    }

    @Override
    double calculateCircumference() {
        return super.calculateCircumference();
    }
}
