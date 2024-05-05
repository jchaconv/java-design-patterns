package core.design.patterns.singleton;

public class TestEnumSingleton {

    public static void main(String[] args) {
        EnumSingletonDemo instance = EnumSingletonDemo.INSTANCE;
        System.out.println(instance.getName());
        instance.setName("Julio");
        System.out.println(instance.getName());
    }


}
