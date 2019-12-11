package tuan6_7;

import java.util.ArrayList;

public class Diagram {

    public ArrayList<Layer> layers = new ArrayList<>();

    public void toString(Layer layer){
        if(layer.visible){
            for (int i = 0; i < layer.shapes.size(); i++) {
                System.out.println(layer.shapes.get(i).toString());
            }

        }
        else {
            System.out.println("Shape not found!");
        }

    }

    public void addLayer(Layer layer) {
        this.layers.add(layer);
    }

    public void deCircles(){
        for(Layer layer:layers ){
            layer.removeCircle();
        }
    }


}
