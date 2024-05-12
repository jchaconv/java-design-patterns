package core.design.patterns.behavioral.templatemethod.datarender;

public class CSVDataRendered extends DataRendered {


    @Override
    public String readData() {
        return "CSV Data";
    }

    @Override
    public String processData(String data) {
        return "Processed " + data;
    }
}
