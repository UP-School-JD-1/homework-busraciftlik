class Rectangle extends Shape {
    int height;
    int weight;

    Rectangle(int weight , int height){
        this.weight = weight;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Rectangle drawn" );
    }

    @Override
    void erase() {
        System.out.println("Rectangle erased");
    }

    @Override
    double calculateCircumference() {
       super.circumference = 2*(height+weight);
       return super.circumference;
    }

    @Override
    double calculateArea() {
        super.area = height*weight;
        return super.area;

    }
}
