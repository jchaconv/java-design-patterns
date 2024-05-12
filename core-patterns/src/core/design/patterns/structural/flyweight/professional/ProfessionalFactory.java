package core.design.patterns.structural.flyweight.professional;

import java.util.HashMap;
import java.util.Map;

public class ProfessionalFactory {

    private static Map<String, Professional> professionals = new HashMap<>();

    public static Professional getProfessional(String professionalType) {

        Professional professional = null;

        if(professionals.get(professionalType) != null) {
            professional = professionals.get(professionalType);
        } else {
            if(professionalType.equalsIgnoreCase("Police")) {
                professional = new PoliceOfficer();
            } else if(professionalType.equalsIgnoreCase("Lawyer")) {
                professional = new Lawyer();
            }
            professionals.put(professionalType, professional);
        }

        return professional;
    }

}
