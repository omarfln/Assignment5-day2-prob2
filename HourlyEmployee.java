public class HourlyEmployee extends Employee{
    private double hours;
    private double wage;
    HourlyEmployee(String firstName, String lastName, double hours, double wage){
        super(firstName,lastName);
        this.hours = hours;
        this.wage = wage;
    }
    public void setHours(double hours) {
        this.hours = hours;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getPayment(){
        return wage * hours;
    }

    @Override
    public String toString(){
        return "Hours: " +
                hours +
                "\twage: " +
                wage
                + "\tPayment: "
                + getPayment();
    }
}
