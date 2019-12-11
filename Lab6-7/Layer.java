package tuan6_7;

import java.util.ArrayList;

public class Layer extends Diagram {
    protected ArrayList<Shape> shapes;

    protected boolean visible;

    public Layer(boolean visible) {

        this.shapes = new ArrayList<>();

        this.visible = visible;

    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeTriangles() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Triangle)
                shapes.remove(i);
        }
    }

    public void removeCircle() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle)
                shapes.remove(i);
        }
    }

    // so sanh 2 shape

    public boolean equalShape(Shape s1, Shape s2){
        if(s1.draw().equals(s2.draw())){
            if(s1.getArea() == s2.getArea())
                return true;
        }
        return false;
    }

    // xoa cac shape trung nhau

    public void deleteShape() {

        for (int i = 0; i < shapes.size(); i++) {
            for (int j = i+1; j < shapes.size(); j++){
                if(equalShape(shapes.get(i), shapes.get(j))){
                    shapes.remove(j);
                }

            }
        }
    }
}
