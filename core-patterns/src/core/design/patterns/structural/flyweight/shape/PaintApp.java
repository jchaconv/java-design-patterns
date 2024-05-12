package core.design.patterns.structural.flyweight.shape;

public class PaintApp {

    public void render(int numberOfShapes) {

        Shape shape = null;

        for (int i = 0; i < numberOfShapes; i++) {
            if(i % 2 == 0) {
                shape = ShapeFactory.getShape("circle");
                shape.draw(i, "red", "white");
            } else {
                shape = ShapeFactory.getShape("rectangle");
                shape.draw(i, i + 1, "dotted");
            }
        }


        /*
        Shape[] shapes = new Shape[numberOfShapes + 1];

        for (int i = 1; i <= numberOfShapes; i++) {
            if(i % 2 == 0) {
                shapes[i] = new Circle();                       //The problem is the recurrent creation of this object and its allocation in memory
                ((Circle)(shapes[i])).setRadius(i);
                ((Circle)(shapes[i])).setLineColor("red");
                ((Circle)(shapes[i])).setFillColor("white");
                shapes[i].draw();
            } else {
                shapes[i] = new Rectangle();                    //The problem is the recurrent creation of this object and its allocation in memory
                ((Rectangle)(shapes[i])).setLength(i);
                ((Rectangle)(shapes[i])).setBreadth(i + i);
                ((Rectangle)(shapes[i])).setFillStyle("dotted");
                shapes[i].draw();
            }
        }
        */


    }


}
