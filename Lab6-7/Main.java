package tuan6_7;

public class Main {
    public static void main(String[] args) {

        Rectangle rec = new Rectangle();
        rec.point = new Point(0, 0);
        rec.length = 50;
        rec.width = 70;
        rec.velocity = new Point(5, 10);
        rec.moveTo();


        Circle circle = new Circle();
        circle.radius = 0.5;
        circle.point = new Point(3, 5);
        circle.velocity = new Point(5, 10);

        Circle circle2 = new Circle();
        circle2.radius = 50;
        circle2.point = new Point(2, 4);
        circle2.velocity = new Point(5, 10);


        Point p1 =  new Point(0,2);
        Point p2 = new Point(1,5);
        Point p3 = new Point(2,4);
        Triangle tri = new Triangle(p1, p2, p3);
        tri.velocity = new Point(5, 10);


        Layer layer = new Layer(true);
        Diagram diagram = new Diagram();

        layer.addShape(rec);
        layer.addShape(circle);
        layer.addShape(circle2);
        layer.addShape(tri);

        diagram.addLayer(layer);
        diagram.toString(layer);

        layer.removeTriangles();
        diagram.toString(layer);

        diagram.deCircles();
        diagram.toString(layer);

        layer.addShape(circle);
        layer.addShape(circle2);
        layer.deleteShape();
        diagram.toString(layer);

        Layer layer1 = new Layer(true);
        Layer layer2 = new Layer(true);
        Layer layer3 = new Layer(true);
        Layer layer4 = new Layer(true);

        for (int i=0; i<layer.shapes.size(); i++){

            if(layer.shapes.get(i) instanceof Circle){
                layer1.addShape(layer.shapes.get(i));
            }

            if(layer.shapes.get(i) instanceof Rectangle){
                layer2.addShape(layer.shapes.get(i));
            }

            if(layer.shapes.get(i) instanceof Square){
                layer3.addShape(layer.shapes.get(i));
            }

            if(layer.shapes.get(i) instanceof Triangle){
                layer4.addShape(layer.shapes.get(i));
            }

        }

        System.out.println("CIRCLE: \n");
        diagram.toString(layer1);

        System.out.println("RECTANGLE: \n");
        diagram.toString(layer2);

        System.out.println("SQUARE: \n");
        diagram.toString(layer3);

        System.out.println("TRIANGLE: \n");
        diagram.toString(layer4);
    }
}
