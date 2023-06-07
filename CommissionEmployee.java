public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    CommissionEmployee(String firstName, String lastName, double grossSales, double commissionRate){
        super(firstName,lastName);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getPayment(){
        return grossSales * commissionRate/100;
    }

    public double getGrossSales(){
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public String toString(){
        return "Gross sales: "+
                grossSales +
                "\tCommission rate:" +
                commissionRate
                + "\tPayment: "
                + getPayment();
    }
}
