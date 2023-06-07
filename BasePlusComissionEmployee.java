public class BasePlusComissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    BasePlusComissionEmployee(String firstName, String lastName, double grossSales, double commissionRate,double baseSalary){
        super(firstName, lastName,grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public double getPayment(){
        return baseSalary + (getGrossSales() * getCommissionRate()/100);
    }

    @Override
    public String toString(){
        return "Base salary: "
                + baseSalary
                + "\tPayment: "
                + getPayment();
    }
}
