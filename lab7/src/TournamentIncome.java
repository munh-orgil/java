public class TournamentIncome extends Player {
    float grade;
    float rate;

    TournamentIncome(String name, float grade, float rate) {
        this.grade = grade;
        this.rate = rate;
        super.name = name;
    }
    public void calculateGradeBonus() {

    }
    @Override
    public void displayDetails() {
        System.out.println(name);
    }
    
}
