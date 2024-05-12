package core.design.patterns.behavioral.templatemethod.computermanufacturer;

public class Test {

    public static void main(String[] args) {

        ComputerManufacturer desktopComputer = new DesktopManufacturer();
        desktopComputer.buildComputer();

        ComputerManufacturer laptopComputer = new LaptopManufacturer();
        laptopComputer.buildComputer();
    }


}
