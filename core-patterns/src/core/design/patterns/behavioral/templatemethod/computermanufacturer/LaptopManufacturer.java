package core.design.patterns.behavioral.templatemethod.computermanufacturer;

public class LaptopManufacturer extends ComputerManufacturer {

    @Override
    void addHardDisk() {
        System.out.println("Add hard disk to Laptop");
    }

    @Override
    void addRAM() {
        System.out.println("Add RAM to Laptop");
    }

    @Override
    void addKeyboard() {
        System.out.println("Add keyboard to Laptop");
    }

}
