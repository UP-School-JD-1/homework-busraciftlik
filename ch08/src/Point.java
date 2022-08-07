public class Point {
    int x ;
    int y;

    public Point(int x , int y){
        this.x = x;
        this.y = y;
    }

    public Point(){

    }
    int getX(){
        return x;
    }

    int getY(){
        return y;
    }
    void setX(int x){
        this.x = x;
    }
    void setY(int y){
        this.y = y;
    }

    double distanceFromOrigin (){
        double distance = 0;
        int squareTotal =  this.x*this.x + this.y*this.y;
        distance = Math.sqrt(squareTotal);
        return distance;
    }

    double distanceBetweenPoints(Point otherPoint){
      double distance = 0;
      int squareX = (this.x - otherPoint.x)*(this.x - otherPoint.x);
      int squareY = (this.y - otherPoint.y)*(this.y - otherPoint.y);
      distance = Math.sqrt(squareX+squareY);
      return distance;
    }

    public Point clone (){
        Point point = new Point();
        point.setX(this.x);
        point.setY(this.y);
        return point;

        //point.x = this.x;
        //point.y = this.y;

    }
    void moveX(int move){
        this.x +=move;
    }

    void moveY(int move){
        this.y+=move;
    }
}

