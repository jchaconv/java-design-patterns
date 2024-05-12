package core.design.patterns.behavioral.templatemethod.datarender;

public class TestDataRendered {

    public static void main(String[] args) {

        DataRendered rendered = new XMLDataRendered();
        rendered.render();

    }


}
