public class Point {
    //private variable
    private int x;
    private int y;

    //constructor that accepts values inputted
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    //constructor that sets one value to both the x and y
    public Point(int value){
        x = value;
        y = value;
    }
    //no-argument constructor
    public Point(){
        x = 0;
        y = 0;
    }
    //getter method for X
    public int getX(){
        return x;
    }
    //getter method for Y
    public int getY() {
        return y;
    }
    //setter method for X
    public void setX(int newX){
        x = newX;
    }
    //setter method for Y
    public void setY(int newY){
        y = newY;
    }
    //method that returns the coordinate string
    public String coordinate(){
        return "(" + x + ", " + y + ")";

    }
    //method that returns quadrant
    public String quadrant(){
        String quadrant;
        if (x > 0 && y > 0) {
          quadrant = "I";
        } else if (x < 0 && y > 0){
            quadrant = "II";
        } else if (x < 0 && y < 0){
            quadrant = "III";
        } else if (x > 0 && y < 0){
            quadrant = "IV";
        } else if (x == 0 && y==0){
            quadrant = "Origin";
        }else {
            quadrant = "on axis";
        }
        return quadrant;
    }

}