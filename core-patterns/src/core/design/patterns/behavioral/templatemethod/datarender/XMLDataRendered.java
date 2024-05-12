package core.design.patterns.behavioral.templatemethod.datarender;

public class XMLDataRendered extends DataRendered {


    @Override
    public String readData() {
        return "XML Data";
    }

    @Override
    public String processData(String data) {
        return "Processed " + data;
    }
}
