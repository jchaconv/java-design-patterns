package core.design.patterns.creational.factory.person;

public class PersonStore {

    public Person getPerson(String gender) {
        Person person = PersonFactory.createPerson(gender);
        person.wish();
        return person;
    }

}
