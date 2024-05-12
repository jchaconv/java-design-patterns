package core.design.patterns.structural.flyweight.shape;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private static Map<String, Shape> shapes = new HashMap<String, Shape>();

    public static Shape getShape(String shapeType) {
        Shape shape = null;
        if(shapes.get(shapeType) != null) {
            shape = shapes.get(shapeType);
        } else {
            if(shapeType.equalsIgnoreCase("circle")) {
                shape = new Circle();
            } else if(shapeType.equalsIgnoreCase("rectangle")) {
                shape = new Rectangle();
            }
            shapes.put(shapeType, shape);
        }
        return shape;
    }


}
