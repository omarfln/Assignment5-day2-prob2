abstract class Employee {
    private String firstName;
    private String lastName;

    Employee(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    private String socialSecurityNumber;
    abstract double getPayment();

}
