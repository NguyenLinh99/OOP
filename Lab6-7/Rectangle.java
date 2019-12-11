package tuan6_7;

public class Rectangle extends Shape{
    protected Point point;
    protected int length, width;

    public Rectangle(){

    }
    public Rectangle(Point p, int _length, int _width){
        point = p;
        length = _length;
        width = _width;
    }

    public String color(){
        return "Draw Red\n";
    }

    public String draw(){
        return "Rectangle\n";
    }

    public void moveTo(){
        this.point.x += this.velocity.x;
        this.point.y += this.velocity.y;
    }

    public double getArea(){
        return length*width;
    }

    public String toString(){
        return super.toString() + "Toa do: (" + point.x + ", " + point.y + ")\n";
    }
}
