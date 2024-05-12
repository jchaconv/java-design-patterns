package core.design.patterns.structural.flyweight.professional;

public class PoliceOfficer extends Professional {

    private String fullName;

    public PoliceOfficer() {
        this.fullName = "Police Officer";
    }

    @Override
    public void describeProfessional(String range, int numberOfWeapons, String carPlate) {
        System.out.println("Officer: " + fullName + " " + range + " with " + numberOfWeapons + " weapons");
    }
}
