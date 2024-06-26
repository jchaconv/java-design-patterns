package core.design.patterns.behavioral.templatemethod.datarender;

public abstract class DataRendered {

    public void render() {
        String data = readData();
        String processedData = processData(data);
        System.out.println(processedData);
    }

    public abstract String readData();

    public abstract String processData(String data);


}
