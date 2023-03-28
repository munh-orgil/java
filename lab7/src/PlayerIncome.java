public class PlayerIncome extends Player {
    double income;
    PlayerIncome(double income) {
        this.income = income;
    }
    
    void calculateTax() {
        
    }
    @Override
    public void displayDetails() {
        System.out.println(super.name);
    }
}
