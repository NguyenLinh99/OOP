package tuan6_7;

abstract public class Shape {
    protected Point velocity;

    public Shape(){

    }

    public Shape(Point p){
        velocity = p;
    }

    abstract public String color();
    abstract public String draw();
    abstract public double getArea();

    abstract public void moveTo();

    public String toString(){
        return "Shape " + draw() + "Dien tich: " + getArea() + "\n" + color() + "\n";
    }
}
