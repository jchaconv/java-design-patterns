package core.design.patterns.factory.person;

public class PersonFactory {

    public static Person createPerson(String gender) {

        Person person = null;

        if(gender.equals("male")) {
            person = new Male();
        } else if(gender.equals("female")) {
            person = new Female();
        }
        return person;
    }


}
