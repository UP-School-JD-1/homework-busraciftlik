class Circle extends Shape {
    int radius;

    Circle(int radius){
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
}