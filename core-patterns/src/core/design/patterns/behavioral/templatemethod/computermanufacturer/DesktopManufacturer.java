package core.design.patterns.behavioral.templatemethod.computermanufacturer;

public class DesktopManufacturer extends ComputerManufacturer {

    @Override
    void addHardDisk() {
        System.out.println("Add hard disk to Desktop Computer");
    }

    @Override
    void addRAM() {
        System.out.println("Add RAM to Desktop Computer");
    }

    @Override
    void addKeyboard() {
        System.out.println("Add keyboard to Desktop Computer");
    }
}
