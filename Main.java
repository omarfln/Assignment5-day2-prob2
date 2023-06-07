// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Employee [] empObj = {
                new CommissionEmployee("Alex", "Raddy",20000, 2 ),
                new HourlyEmployee("Saad", "Mahnoun", 40, 38),
                new SalariedEmployee("John", "Ser", 3500),
                new BasePlusComissionEmployee("Hanna", "James", 5000, 3, 500),
                new SalariedEmployee("Ariel", "Assaf", 2730.927),

        };

        double sum = 0;
        for (Employee e : empObj){
            System.out.println(e.getClass().getName() + e.getPayment());
            sum += e.getPayment();
        }

        System.out.println("Total salaries amount: " + sum);

    }

}