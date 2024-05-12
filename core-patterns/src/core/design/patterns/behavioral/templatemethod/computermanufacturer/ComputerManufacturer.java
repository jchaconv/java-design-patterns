package core.design.patterns.behavioral.templatemethod.computermanufacturer;

public abstract class ComputerManufacturer {

    public void buildComputer() {
        addKeyboard();
        addHardDisk();
        addRAM();
    }

    abstract void addHardDisk();
    abstract void addRAM();
    abstract void addKeyboard();

}
