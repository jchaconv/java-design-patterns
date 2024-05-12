package core.design.patterns.creational.factory.person;

public class TestPersonStore {

    public static void main(String[] args) {
        PersonStore personStore = new PersonStore();
        personStore.getPerson("male");
        personStore.getPerson("female");
    }


}
