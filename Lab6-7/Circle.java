package tuan6_7;

public class Circle extends Shape{

    protected double radius;
    protected Point point;
    static final double PI = 3.14;

    public Circle(Point p, double _r){
        point = p;
        radius = _r;
    }

    public Circle(){

    }



    public double getArea(){
        return radius*radius*PI;
    }

    public String color(){
        return "Draw Green\n";
    }

    public String draw(){
        return "Circle\n";
    }

    public void moveTo(){
        this.point.x += this.velocity.x;
        this.point.y += this.velocity.y;
    }

    public String toString(){
        return super.toString() + "Toa do: (" + point.x + ", " + point.y + ")\n";
    }
}
