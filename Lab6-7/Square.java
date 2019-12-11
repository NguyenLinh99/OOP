package tuan6_7;

public class Square extends Rectangle {

    public Square(Point p, int size){
        super(p, size, size);
    }
    public Square(){

    }

    public String color(){
        return "Draw Blue\n";
    }

    public String draw(){
        return "Square\n";
    }

    public String toString(){
        return super.toString();
    }
}
