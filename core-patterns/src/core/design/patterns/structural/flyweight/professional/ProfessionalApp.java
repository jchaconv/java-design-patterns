package core.design.patterns.structural.flyweight.professional;

public class ProfessionalApp {

    public static void showProfessionals(int numberOfProfessionals) {

        Professional professional = null;

        for (int i = 0; i < numberOfProfessionals; i++) {
            if(i % 2 == 0) {
                professional = ProfessionalFactory.getProfessional("Police");
                professional.describeProfessional("commander", 2, "XCV-556");
            } else {
                professional = ProfessionalFactory.getProfessional("Lawyer");
                professional.describeProfessional(5563324, 2);
            }
        }

    }

    public static void main(String[] args) {
        showProfessionals(5);
    }

}
