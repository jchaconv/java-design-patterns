package core.design.patterns.structural.flyweight.professional;

public class Lawyer extends Professional {

    private String fullName;

    public Lawyer() {
        this.fullName = "Harry Specter";
    }

    @Override
    public void describeProfessional(int licenseNumber, int numberOfJudgments) {
        System.out.println("Lawyer " + licenseNumber + " with " + numberOfJudgments + " judgments");
    }
}
