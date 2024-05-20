package core.design.patterns.behavioral.decorator;

//Concrete Component
public class PlainPizza implements Pizza {

    @Override
    public void bake() {
        System.out.println("Baking Plain Pizza");
    }

}
