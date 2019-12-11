package tuan6_7;

import static java.lang.Math.sqrt;

public class Triangle extends Shape{

    protected Point p1, p2, p3;

    public Triangle(Point p1, Point p2, Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;

    }

    public Triangle(){}

    public double distance(Point p1, Point p2){
        double d = (p1.x-p2.x)*(p1.x-p2.x);
        d += (p1.y-p2.y)*(p1.y-p2.y);
        d = sqrt(d);
        return d;
    }

    public String color(){
        return "Draw Yellow\n";
    }

    public String draw(){
        return "Triangle\n";
    }

    public void moveTo(){
        this.p1.x += this.velocity.x;
        this.p1.y += this.velocity.y;

        this.p2.x += this.velocity.x;
        this.p2.y += this.velocity.y;

        this.p3.x += this.velocity.x;
        this.p3.y += this.velocity.y;
    }

    public double getArea(){
        double a = distance(p1, p2);
        double b = distance(p1, p3);
        double c = distance(p2, p3);
        double s = (a+b+c)/2;
        s = (s-a)*(s-b)*(s-c)*s;
        s = sqrt(s);
        return s;
    }

    public String toString(){
        return draw() + color() + getArea();
    }
}
