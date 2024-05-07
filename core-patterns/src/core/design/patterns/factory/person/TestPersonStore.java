package core.design.patterns.factory.person;

public class TestPersonStore {

    public static void main(String[] args) {
        PersonStore personStore = new PersonStore();
        personStore.getPerson("male");
        personStore.getPerson("female");
    }


}
