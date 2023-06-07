public class SalariedEmployee extends Employee{
    private double weeklySalary;

    SalariedEmployee(String firstName, String lastName, double weeklySalary){
        super(firstName,lastName);
        this.weeklySalary = weeklySalary;
    }
    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
    public double getPayment(){
        return weeklySalary;
    }

    @Override
    public String toString(){
        return "Weekly salary: " +
                weeklySalary
                + "\tPayment: "
                + getPayment();
    }
}
