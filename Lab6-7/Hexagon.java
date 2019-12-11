package tuan6_7;

import static java.lang.Math.sqrt;

public class Hexagon extends Shape{
    protected Point point;
    protected int canh;

    public Hexagon(){

    }

    public String color(){
        return "Draw Yellow\n";
    }

    public String draw(){
        return "Hexagon\n";
    }

    public void moveTo(){
        this.point.x += this.velocity.x;
        this.point.y += this.velocity.y;
    }

    public double getArea(){
        double s = (canh*canh*3*sqrt(3))/2;
        return s;
    }


    public String toString(){
        return super.toString() + "Toa do: (" + point.x + ", " + point.y + ")\n";
    }
}
